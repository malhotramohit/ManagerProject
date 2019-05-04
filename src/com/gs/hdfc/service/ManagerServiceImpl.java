package com.gs.hdfc.service;

import com.gs.hdfc.bean.Manager;
import com.gs.hdfc.bean.Project;

import com.gs.hdfc.dao.ManagerDAO;
import com.gs.hdfc.dao.ManagerDAOImpl;
import com.gs.hdfc.util.Utility;

public class ManagerServiceImpl {

	private ManagerDAO managerDAOImpl = new ManagerDAOImpl();
	
	public void save(Manager manager) {
		// Dao layers save
		managerDAOImpl.save(manager);
	}

	public Manager findById(long id) {
		return managerDAOImpl.findById(id);
	}

	public Manager[] findAll() {
		return managerDAOImpl.findAll();
	}
    
	public Project[] getProjectStartingWithByManagerId(long id, String startingStr) {

		Manager manager = findById(id);
		Project[] projects = manager.getProjects();
		//Project[] projectsToReturn = new Project[];
		Project[] projectsToReturn = null;
		for (int i = 0; i < projects.length; i++) {
			if(projects != null){
				if(projects[i] != null){
					if (projects[i].getProjectName().startsWith(startingStr)) {
						projectsToReturn = projects;
					}
				}
				
			}
			
		}
		return projectsToReturn;

	}

	public Manager[] getAllManagerByEvenAge() {

		Manager[] managers = managerDAOImpl.findAll();
		Manager[] managers2Return = new Manager[managers.length];
		int index = 0;
		for (int i = 0; i < managers.length; i++) {
			if (null != managers[i]) {
				int age = managers[i].getAge();
				if (Utility.isEvenNumber(age)) {
					managers2Return[index] = managers[i];
					index++;
				}
			}
		}
		return managers2Return;

	}
	
	public String update(Manager manager){
		managerDAOImpl.update(manager);
		return "Updated";
	}
	
	

}
