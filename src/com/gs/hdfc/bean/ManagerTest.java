package com.gs.hdfc.bean;

import java.util.List;

import com.gs.hdfc.service.ManagerServiceImpl;
import com.gs.hdfc.util.ManagerConstants;

public class ManagerTest {

	private ManagerServiceImpl managerServiceImpl = new ManagerServiceImpl();

	public static void main(String[] args) {
		ManagerTest managerTest = new ManagerTest();

		managerTest.displayAllManagers();

	}

	// test
	private void displayAllManagers() {

		List<Manager> managers = managerServiceImpl.getAllManagerByEvenAge();

		for (int i = 0; i < managers.size(); i++) {

			if (null != managers.get(i)) {
				System.out.println("-----Detail-----" + i);
				System.out.println(ManagerConstants.MANAGER_ID + "::" + managers.get(i).getManagerId());
				System.out.println(ManagerConstants.MANAGER_NAME + "::" + managers.get(i).getName());
				System.out.println(ManagerConstants.MANAGER_AGE + "::" + managers.get(i).getAge());
				System.out.println(ManagerConstants.MANAGER_SALARY + "::" + managers.get(i).getSalary());
				System.out.println(ManagerConstants.MANAGER_PROJECTS + "::");
				List<String> projects = managerServiceImpl
						.getProjectStartingWithByManagerId(managers.get(i).getManagerId(), "S");
				// managers.get(i).getProjects();
				// .getProjectStartingWithByManagerId(managers.get(i).getManagerId(), "S");
				for (int j = 0; j < projects.size(); j++) {
					if (null != projects.get(j)) {
						System.out.println(ManagerConstants.PROJECT_NAME + "::" + projects.get(j));
					}
				}

			}

		}

	}

}
