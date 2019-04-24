package com.gs.hdfc.bean;

import com.gs.hdfc.service.ManagerServiceImpl;
import com.gs.hdfc.util.ManagerConstants;

public class ManagerTest {

	private ManagerServiceImpl managerServiceImpl = new ManagerServiceImpl();

	public static void main(String[] args) {
		ManagerTest managerTest = new ManagerTest();

		managerTest.displayAllManagers();
		
	}

	private void displayAllManagers() {

		Manager[] managers = managerServiceImpl.getAllManagerByEvenAge();

		for (int i = 0; i < managers.length; i++) {

			if (null != managers[i]) {
				System.out.println("-----Detail-----"+i);
				System.out.println(ManagerConstants.MANAGER_ID + "::" + managers[i].getManagerId());
				System.out.println(ManagerConstants.MANAGER_NAME + "::" + managers[i].getName());
				System.out.println(ManagerConstants.MANAGER_AGE + "::" + managers[i].getAge());
				System.out.println(ManagerConstants.MANAGER_SALARY + "::" + managers[i].getSalary());
				System.out.println(ManagerConstants.MANAGER_PROJECTS + "::");
				String[] projects = managerServiceImpl.getProjectStartingWithByManagerId(managers[i].getManagerId(), "S");
				for (int j = 0; j < projects.length; j++) {
					if (null != projects[i]) {
						System.out.println(ManagerConstants.PROJECT_NAME + "::" + projects[j]);
					}
				}

			}

		}

	}

}
