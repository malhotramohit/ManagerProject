package com.gs.hdfc.service;

import com.gs.hdfc.bean.Manager;
import com.gs.hdfc.dao.ManagerDAOImpl;
import com.gs.hdfc.util.Utility;
import com.gs.hdfc.util.VirtualDatabaseUtil;

public class ManagerServiceImpl {
	
	//Creating instance of MaagerDAOImpl class
	ManagerDAOImpl managerDAOImpl = new ManagerDAOImpl();
	
	public void save(Manager manager)
	{
		System.out.println("Inside MangerServiceImpl save method");
		managerDAOImpl.save(manager);
	}
	
	public Manager findByID(long id)
	{
		System.out.println("Inside findByID method of ManagerServiceImpl");
		Manager man[] = VirtualDatabaseUtil.getManagerTable();
		int tuple =0;
		for(int i=0;i<man.length;i++)
		{
			if(man[i]==null)
				break;
			else
			{
				long manId=man[i].getManagerID();
				tuple = i;
			}
		}
		return man[tuple];
	}
	
	public Manager[] findAll()
	{
		System.out.println("Inside findAll method of ManagerServiceImpl");
		Manager man[] = VirtualDatabaseUtil.getManagerTable();
		return man;
	}
	
	public Manager[] getAllManagerByEvenAge()
	{
		System.out.println("Inside getAllManagerByEvenAge method of ManagerServiceImpl");
		int tuple=0;
		//Fetch all manager data
		Manager man[] = VirtualDatabaseUtil.getManagerTable();
		Manager manTupleTOReturn[] = new Manager[man.length];
		for(int i =0;i<man.length;i++)
		{
			if(man[i]==null)
				break;
			else
			{
				//int age = man[i].getAge();
				Utility utility = new Utility();
				boolean res=utility.isEven(man[i].getAge());
				if(res==true)
				{
					manTupleTOReturn[tuple] = man[i];
					tuple++;
				}
			}
		}
		return manTupleTOReturn;
	}

}
