// edit 1
package com.gs.hdfc.bean;

public class Manager {

	private long managerId;
	private String name;
	private int age;
	private double salary;
	private char gender;
	private double yearOfExp;
	private String[] projects;
	private long[] phonenumbers;

	/**
	 * 
	 */
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param managerId
	 * @param name
	 * @param age
	 * @param salary
	 * @param gender
	 * @param yearOfExp
	 * @param projects
	 * @param phonenumbers
	 */
	public Manager(long managerId, String name, int age, double salary, char gender, double yearOfExp,
			String[] projects, long[] phonenumbers) {
		this.managerId = managerId;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		this.yearOfExp = yearOfExp;
		this.projects = projects;
		this.phonenumbers = phonenumbers;
	}

	/**
	 * @return the managerId
	 */
	public long getManagerId() {
		return managerId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}

	/**
	 * @return the yearOfExp
	 */
	public double getYearOfExp() {
		return yearOfExp;
	}

	/**
	 * @return the projects
	 */
	public String[] getProjects() {
		return projects;
	}

	/**
	 * @return the phonenumbers
	 */
	public long[] getPhonenumbers() {
		return phonenumbers;
	}

	/**
	 * @param managerId
	 *            the managerId to set
	 */
	public void setManagerId(long managerId) {
		this.managerId = managerId;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param salary
	 *            the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}

	/**
	 * @param yearOfExp
	 *            the yearOfExp to set
	 */
	public void setYearOfExp(double yearOfExp) {
		this.yearOfExp = yearOfExp;
	}

	/**
	 * @param projects
	 *            the projects to set
	 */
	public void setProjects(String[] projects) {
		this.projects = projects;
	}

	/**
	 * @param phonenumbers
	 *            the phonenumbers to set
	 */
	public void setPhonenumbers(long[] phonenumbers) {
		this.phonenumbers = phonenumbers;
	}

}
