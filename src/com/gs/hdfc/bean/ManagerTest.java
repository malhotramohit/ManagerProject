package com.gs.hdfc.bean;

import com.gs.hdfc.service.ManagerServiceImpl;
import com.gs.hdfc.util.ManagerConstants;
import com.gs.hdfc.util.VirtualDatabaseUtil;

public class ManagerTest {

	private ManagerServiceImpl managerServiceImpl = new ManagerServiceImpl();

	public static void main(String[] args) {
		ManagerTest managerTest = new ManagerTest();
		
		managerTest.displayAllManagers();
		System.out.println("After Update");
		managerTest.updateManager();
		managerTest.displayAllManagers();
		
	}

	//test
	private void displayAllManagers() {

//		Manager[] managers = managerServiceImpl.getAllManagerByEvenAge();
		Manager[] managers = VirtualDatabaseUtil.getManagerTable();
		for (int i = 0; i < managers.length; i++) {

			if (null != managers[i]) {
				System.out.println("-----Detail-----"+i);
				System.out.println(ManagerConstants.MANAGER_ID + "::" + managers[i].getManagerId());
				System.out.println(ManagerConstants.MANAGER_NAME + "::" + managers[i].getName());
				System.out.println(ManagerConstants.MANAGER_AGE + "::" + managers[i].getAge());
				System.out.println(ManagerConstants.MANAGER_SALARY + "::" + managers[i].getSalary());
				System.out.println(ManagerConstants.MANAGER_PROJECTS + "::");
				//String[] projects = managerServiceImpl.getProjectStartingWithByManagerId(managers[i].getManagerId(), "S");
				Project[] projects = managers[i].getProjects();
				for (int j = 0; j < projects.length; j++) {
					if (null != projects[i]) {
						System.out.println(ManagerConstants.PROJECT_NAME + "::" + projects[j].getName());
					}
				}

			}

		}

	}
	
	private void updateManager() {
		Manager man = new Manager(1, "Jaydeep", 28, 25000, 'M', 5,VirtualDatabaseUtil.getProjectTable(), new long[]{9538877,655456464,564564});
		managerServiceImpl.updateManager(man);
	}
	
	
}
