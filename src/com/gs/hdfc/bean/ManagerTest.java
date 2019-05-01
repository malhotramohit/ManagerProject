package com.gs.hdfc.bean;

import com.gs.hdfc.service.ManagerServiceImpl;
import com.gs.hdfc.util.ManagerConstants;
import com.gs.hdfc.util.VirtualDatabaseUtil;

public class ManagerTest {
	
	static ManagerServiceImpl managerServiceImpl = new ManagerServiceImpl();
	//static ManagerDAOImpl managerDAOImpl = new ManagerDAOImpl();
	static ManagerConstants managerconstant = new ManagerConstants();
 	
	public static void main(String[] args) {
		ManagerTest managerTest = new ManagerTest();
		
		System.out.println("Inside main method of Manager Test");
		Manager managertest[] = VirtualDatabaseUtil.getManagerTable();
		managerTest.display();
		
	}
	
	public static void display()
	{
		System.out.println("Inside Display method of ManagerTest Class");
		//Manager man[] = managerDAOImpl.findAll();
		Manager man[] = managerServiceImpl.getAllManagerByEvenAge();
		for(int i=0;i<man.length;i++)
		{
			if(man[i]==null)
			{
				break;
			}
			else
			{
				System.out.println(managerconstant.MANAGER_ID+":"+man[i].getManagerID());
				System.out.println(managerconstant.MANAGER_NAME+":"+man[i].getName());
				System.out.println(managerconstant.MANAGER_AGE+":"+man[i].getAge());
				System.out.println(managerconstant.MANAGER_GENDER+":"+man[i].getGender());
				System.out.println(managerconstant.MANAGER_EXP+":"+man[i].getYearOfExp());
				System.out.println(managerconstant.MANAGER_SALARY+":"+man[i].getSalary());
				
				for(int j=0;j<man[i].getPhonenumbers().length;j++)
				{
					if(man[i].getPhonenumbers()[j]==0)
					{
						System.out.println("Do nothing");
						break;
					}
					else
				System.out.println(managerconstant.MANAGER_NUMBERS+":"+man[i].getPhonenumbers()[j]);
				}
				
				Project[] p = man[i].getProject();
	
				for(int k=0;k<p.length;k++)
				{
					if(p[k]==null)
						break;
					else {
						System.out.println("***********************************************");
						System.out.println(managerconstant.PROJECT_NAME+":"+p[k].getPname());
						System.out.println(managerconstant.PROJECT_ID+":"+p[k].getPid());
						System.out.println(managerconstant.PROJECT_NOOFYEARS+":"+p[k].getNoOfyears());
						System.out.println(managerconstant.PROJECT_YEAROFCOMPLETION+":"+p[k].getCompletionYear());
				}
					
				}
				
		
			}
		System.out.println("***********************************************");
		System.out.println("***********************************************");
		System.out.println("***********************************************");
		}
			
		
	}
	
	

}
