package com.gs.hdfc.util;

import com.gs.hdfc.bean.Manager;
import com.gs.hdfc.bean.Project;

public class VirtualDatabaseUtil {
	static long id;
	
	private static Manager managerTable[] = new Manager[5];
	private static Project project[] = new Project[5];
	static {
		
		//String p1[] = {"RWCS","H3G","TELSTRA"};
		Project project1 = new Project("Telstra", 100, 2.1, 2020);
		Project project2 = new Project("WIND", 101, 2.5, 2019);
		Project[] projects = {project1,project2};
		
		Project project3 = new Project("FRC", 102, 6.1, 2025);
		Project project4 = new Project("RWCS", 103, 7.5, 2030);
		Project[] projects1 = {project3,project4};
		
		long n1[] = {78487,7885566,987451};
		String p2[]= {"BOARD_FIXING","WIND","TELSTRA"};
		long n2[]= {6987455,2245668,4488554};
		
		//Manager manager1 = new Manager(1001, "Vineet", 28, 25478545.256, 'M', 5.3, project1, n1);
		Manager manager1 = new Manager(1001, "Vineet", 28, 25478954.214, 'M', 5.3, projects, n1);
		managerTable[0] = manager1;
		
		Manager manager2 = new Manager(1002, "Shagun", 26, 88877445.254, 'F', 6.5, projects1, n2);
		
		managerTable[1]=manager2;
	}

	public static long getId() {
		return id;
	}

	public static void setId(long id) {
		VirtualDatabaseUtil.id = id;
	}

	public static Manager[] getManagerTable() {
		return managerTable;
	}

	public static void setManagerTable(Manager[] managerTable) {
		VirtualDatabaseUtil.managerTable = managerTable;
	}
	
}
