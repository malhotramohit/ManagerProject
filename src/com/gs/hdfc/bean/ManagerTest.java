package com.gs.hdfc.bean;

import java.util.Scanner;

import com.gs.hdfc.service.ManagerServiceImpl;
import com.gs.hdfc.service.ProjectServiceImpl;
import com.gs.hdfc.util.ManagerConstants;

public class ManagerTest {

	private ManagerServiceImpl managerServiceImpl = new ManagerServiceImpl();
	private ProjectServiceImpl projectServiceImpl = new ProjectServiceImpl();

	public static void main(String[] args) {
		ManagerTest managerTest = new ManagerTest();

		managerTest.displayAllManagers();
		System.out.println(ManagerConstants.MANAGER_ID + "::");
		managerTest.updateManager();
		managerTest.saveProject();
		managerTest.displayAllProjects();
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
				Project[] projects = managerServiceImpl.getProjectStartingWithByManagerId(managers[i].getManagerId(), "S");
				for (int j = 0; j < projects.length; j++) {
					if (null != projects && projects[j] != null) {
						System.out.println(ManagerConstants.PROJECT_NAME + "::" + projects[j].getProjectName());
					}
				}

			}

		}	
	}
	
	//Update Manager
	private void updateManager(){
		Project[] project4 = projectServiceImpl.findAll();
		Manager m1 = new Manager(1, "Hansnath", 30, 36000.35, 'M', 7.3, project4,
				new long[] { 234234, 2342455, 876786 });
		System.out.println(managerServiceImpl.update(m1));
	}
	
	private void displayAllProjects(){
		Project[] projects = projectServiceImpl.findAll();
		for (int i = 0; i < projects.length; i++) {

			if (null != projects[i]) {
				System.out.println("-----Project Details-----"+i);
				System.out.println(ManagerConstants.PROJECT_ID + "::" + projects[i].getId());
				System.out.println(ManagerConstants.PROJECT_NAME + "::" + projects[i].getProjectName());
				
			}

		}
	}
	
	private void saveProject(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter " + ManagerConstants.PROJECT_ID + "::");
		long project_id = sc.nextLong();
		System.out.println("Enter " + ManagerConstants.PROJECT_NAME + "::");
		String project_name = sc.next();
		Project p1 = new Project(project_id, project_name);
		projectServiceImpl.save(p1);
	}
	

}
