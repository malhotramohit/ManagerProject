package com.gs.hdfc.bean;

public class Project {
	private long id;
	private String projectName;
	
	/**
	 * @param project_id
	 * @param projectName
	 */
	public Project(long id, String projectName) {
		super();
		this.id = id;
		this.projectName = projectName;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
}
