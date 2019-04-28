package com.gs.hdfc.util;

import com.gs.hdfc.bean.Manager;
import com.gs.hdfc.bean.Project;

public class VirtualDatabaseUtil {

	private static Manager[] managerTable;
	private static Project[] projectTable;

	private static long manager_id;
	private static long project_id;

	static {

		// Created array of size 5
		manager_id = 0;
		project_id = 0;
		managerTable = new Manager[5];
		projectTable = new Project[5];
		
		String[] projects1 = { "Project 1", "Sroject 2", "Project 3" };

		// need to check long values
		Manager manager1 = new Manager(++manager_id, "Sample Manager 1", 24, 233334.56, 'M', 4.5, projects1,
				new long[] { 43443454, 657776644, 23232313 });

		managerTable[0] = manager1;

		String[] projects2 = { "Project 11", "Project 22", "Sroject 33" };

		// need to check long values
		Manager manager2 = new Manager(++manager_id, "Sample Manager 2", 26, 23576734.56, 'F', 4.5, projects2,
				new long[] { 234234, 2342455, 876786 });

		managerTable[1] = manager2;

		// need to check long values
		Manager manager3 = new Manager(++manager_id, "Sample Manager 3", 28, 23576734.56, 'M', 4.5, projects2,
				new long[] { 234234, 2342455, 876786 });

		managerTable[2] = manager3;
		
		// creating default project
		Project project4 = new Project(++project_id, "Project name 1");
		projectTable[0] = project4;


	}

	/**
	 * @return the managerTable
	 */
	public static Manager[] getManagerTable() {
		return managerTable;
	}

	/**
	 * @return the projectTable
	 */
	public static Project[] getProjectTable() {
		return projectTable;
	}

	/**
	 * @param projectTable the projectTable to set
	 */
	public static void setProjectTable(Project[] projectTable) {
		VirtualDatabaseUtil.projectTable = projectTable;
	}

	/**
	 * @param managerTable
	 *            the managerTable to set
	 */
	public static void setManagerTable(Manager[] managerTable) {
		VirtualDatabaseUtil.managerTable = managerTable;
	}

}
