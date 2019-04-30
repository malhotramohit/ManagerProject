package com.gs.hdfc.util;

import com.gs.hdfc.bean.Manager;

public class VirtualDatabaseUtil {
	static long id;
	
	private static Manager managerTable[] = new Manager[5];
	
	static {
		
		String p1[] = {"RWCS","H3G","TELSTRA"};
		long n1[] = {78487,7885566,987451};
		String p2[]= {"BOARD_FIXING","WIND","TELSTRA"};
		long n2[]= {6987455,2245668,4488554};
		
		Manager manager1 = new Manager(1001, "Vineet", 28, 25478545.256, 'M', 5.3, p1, n1);
		
		managerTable[0] = manager1;
		
		Manager manager2 = new Manager(1002, "Shagun", 27, 88877445.254, 'F', 6.5, p2, n2);
		
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
