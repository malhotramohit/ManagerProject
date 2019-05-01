package com.gs.hdfc.bean;

public class Project {
	
	private String pname;
	private int pid;
	private double noOfyears;
	private int completionYear;
	

	public Project(String pname, int pid, double noOfyears, int completionYear) {
		super();
		this.pname = pname;
		this.pid = pid;
		this.noOfyears = noOfyears;
		this.completionYear = completionYear;
	}
	//Getter and Setters
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public double getNoOfyears() {
		return noOfyears;
	}
	public void setNoOfyears(double noOfyears) {
		this.noOfyears = noOfyears;
	}
	public int getCompletionYear() {
		return completionYear;
	}
	public void setCompletionYear(int completionYear) {
		this.completionYear = completionYear;
	}

}
