package com.gs.hdfc.util;

public class Utility {

	public Utility() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside Utility Constructor");
	}
	
	public static boolean isEven(int age)
	{
		System.out.println("Inside isEven Method");
		if(age%2==0)
		{
			System.out.println("Age is Even");
			return true;
		}
		else
		{
			System.out.println("Age is Odd");
			return false;
		}
	}
}
