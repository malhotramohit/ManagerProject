package com.gs.hdfc.bean;

public class Manager {
	
	private long managerID;
	private String name;
	private int age;
	private double salary;
	private char gender;
	private double yearOfExp;
	private String projects[];
	private long phonenumbers[];
	
	public long getManagerID() {
		return managerID;
	}
	public void setManagerID(long managerID) {
		this.managerID = managerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public double getYearOfExp() {
		return yearOfExp;
	}
	public void setYearOfExp(double yearOfExp) {
		this.yearOfExp = yearOfExp;
	}
	public String[] getProjects() {
		return projects;
	}
	public void setProjects(String[] projects) {
		this.projects = projects;
	}
	public long[] getPhonenumbers() {
		return phonenumbers;
	}
	public void setPhonenumbers(long[] phonenumbers) {
		this.phonenumbers = phonenumbers;
	}
	//Constructor
	public Manager() {
		System.out.println("Inside Manager Non-Parameterized Constructor");
	}
	//Constructor Non- Parameterized
	public Manager(long managerID, String name, int age, double salary, char gender, double yearOfExp,
			String[] projects, long[] phonenumbers) {
		this.managerID = managerID;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		this.yearOfExp = yearOfExp;
		this.projects = projects;
		this.phonenumbers = phonenumbers;
	}
	
	
}
