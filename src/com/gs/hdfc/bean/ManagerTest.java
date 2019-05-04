package com.gs.hdfc.bean;

import java.util.Scanner;

import com.gs.hdfc.service.ManagerServiceImpl;
import com.gs.hdfc.util.ManagerConstants;
import com.gs.hdfc.util.VirtualDatabaseUtil;

public class ManagerTest {

	private ManagerServiceImpl managerServiceImpl = new ManagerServiceImpl();

	public static void main(String[] args) {
		ManagerTest managerTest = new ManagerTest();
		
		managerTest.displayAllManagers();
		System.out.println("After Update");
		Scanner sc = new Scanner(System.in);
		Manager man = new Manager();
		System.out.println("Enter Manager ID: ");
		long managerId = sc.nextLong();
		man.setManagerId(managerId);
		System.out.println("Enter Manager Name: ");
		String name = sc.next();
		man.setName(name);
		System.out.println("Enter Manager Age: ");
		int age = sc.nextInt();
		man.setAge(age);
		System.out.println("Enter Manager Salary: ");
		double salary = sc.nextDouble();
		man.setSalary(salary);
		System.out.println("Enter Gender: ");
		char gender = sc.next().charAt(0);
		man.setGender(gender);
		System.out.println("Enter Year of Exp: ");
		double yearOfExp = sc.nextDouble();
		man.setYearOfExp(yearOfExp);
		Project[] projects = new Project[2];
		for(int i = 0; i < projects.length; i++) {
			System.out.println("Enter Project ID: ");
			long project_id = sc.nextLong();
			
			System.out.println("Enter Project Name: ");
			String pro_name = sc.next();
			projects[i] = new Project(project_id,pro_name);
		}
		man.setProjects(projects);
		man.setPhonenumbers(new long[]{9538877,655456464,564564});
		managerTest.updateManager(man);
		managerTest.displayAllManagers();
	}

	//test
	private void displayAllManagers() {
		//Manager[] managers = managerServiceImpl.getAllManagerByEvenAge();
		Manager[] managers = VirtualDatabaseUtil.getManagerTable();
		for(int i = 0; i < managers.length; i++) {
			if(null != managers[i]) {
				System.out.println("-----Detail-----"+i);
				System.out.println(ManagerConstants.MANAGER_ID + "::" + managers[i].getManagerId());
				System.out.println(ManagerConstants.MANAGER_NAME + "::" + managers[i].getName());
				System.out.println(ManagerConstants.MANAGER_AGE + "::" + managers[i].getAge());
				System.out.println(ManagerConstants.MANAGER_SALARY + "::" + managers[i].getSalary());
				System.out.println(ManagerConstants.MANAGER_PROJECTS + "::");
				//String[] projects = managerServiceImpl.getProjectStartingWithByManagerId(managers[i].getManagerId(), "S");
				Project[] projects = managers[i].getProjects();
				for (int j = 0; j < projects.length; j++) {
					if (null != projects[j]) {
						System.out.println(ManagerConstants.PROJECT_NAME + "::" + projects[j].getName());
					}
				}
				System.out.println(ManagerConstants.MANAGER_NUMBERS + "::");
				//String[] projects = managerServiceImpl.getProjectStartingWithByManagerId(managers[i].getManagerId(), "S");
				long[] phone_numbers = managers[i].getPhonenumbers();
				for (int j = 0; j < phone_numbers.length; j++) {
					System.out.println(ManagerConstants.MANAGER_NUMBERS + "::" + phone_numbers[j]);
				}
			}
		}
	}
	
	private void updateManager(Manager man) {
		//Manager man = new Manager(1, "Jaydeep", 28, 25000, 'M', 5,VirtualDatabaseUtil.getProjectTable(), new long[]{9538877,655456464,564564});
		managerServiceImpl.updateManager(man);
	}
}
