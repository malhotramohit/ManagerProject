package com.gs.hdfc.bean;

import com.gs.hdfc.service.ManagerServiceImpl;
import com.gs.hdfc.util.ManagerConstants;

public class ManagerTest {

	private ManagerServiceImpl managerServiceImpl = new ManagerServiceImpl();

	public static void main(String[] args) {
		ManagerTest managerTest = new ManagerTest();

		managerTest.displayAllManagers();
		System.out.println(ManagerConstants.MANAGER_ID + "::");
		managerTest.updateManager();
		managerTest.displayAllManagers();
		
	}

	//test
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
	
	//Update Manager
	private void updateManager(){
		Manager m1 = new Manager(1, "Hansnath", 30, 36000.35, 'M', 7.3, new String[] {"S1","SP2"},
				new long[] { 234234, 2342455, 876786 });
		System.out.println(managerServiceImpl.update(m1));
	}
	

}
