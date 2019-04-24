package com.gs.hdfc.util;

import com.gs.hdfc.bean.Manager;

public class VirtualDatabaseUtil {

	private static Manager[] managerTable;

	private static long id;

	static {

		// Created array of size 5
		id = 0;
		managerTable = new Manager[5];

		String[] projects1 = { "Project 1", "Sroject 2", "Project 3" };

		// need to check long values
		Manager manager1 = new Manager(++id, "Sample Manager 1", 24, 233334.56, 'M', 4.5, projects1,
				new long[] { 43443454, 657776644, 23232313 });

		managerTable[0] = manager1;

		String[] projects2 = { "Project 11", "Project 22", "Sroject 33" };

		// need to check long values
		Manager manager2 = new Manager(++id, "Sample Manager 2", 26, 23576734.56, 'F', 4.5, projects2,
				new long[] { 234234, 2342455, 876786 });

		managerTable[1] = manager2;

		// need to check long values
		Manager manager3 = new Manager(++id, "Sample Manager 3", 28, 23576734.56, 'M', 4.5, projects2,
				new long[] { 234234, 2342455, 876786 });

		managerTable[2] = manager3;

	}

	/**
	 * @return the managerTable
	 */
	public static Manager[] getManagerTable() {
		return managerTable;
	}

	/**
	 * @param managerTable
	 *            the managerTable to set
	 */
	public static void setManagerTable(Manager[] managerTable) {
		VirtualDatabaseUtil.managerTable = managerTable;
	}

}
