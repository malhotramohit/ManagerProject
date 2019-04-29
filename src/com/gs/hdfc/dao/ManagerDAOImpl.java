package com.gs.hdfc.dao;

import com.gs.hdfc.bean.Manager;
import com.gs.hdfc.util.VirtualDatabaseUtil;

public class ManagerDAOImpl {
		
	
	void save(Manager manager)
	{
		System.out.println("");
		Manager mangerTable[] = VirtualDatabaseUtil.getManagerTable();
		int checkFreesSlot = 0;
		
		for(int i=0;i<mangerTable.length;i++)
		{
			if(mangerTable[i]==null)
			{
				checkFreesSlot = i;
				break;
			}
		}
		mangerTable[checkFreesSlot] = manager; 
		
	}
	
	public Manager findByID(long id)
	{
		Manager objToReturn=null;
		//Get Manager Table
		Manager man[] = VirtualDatabaseUtil.getManagerTable();
		
		for(int i=0;i<man.length;i++)
		{
			if(man[i].getManagerID()==id)
			{
				System.out.println("Eureka Found It");
				objToReturn= man[i];
				break;
			}
		}
		
		return objToReturn;
	}
	
	public Manager[] findAll()
	{
		System.out.println("Inside findALL Method");
		Manager manToreturn[]=VirtualDatabaseUtil.getManagerTable();
		return manToreturn;
	}
}
