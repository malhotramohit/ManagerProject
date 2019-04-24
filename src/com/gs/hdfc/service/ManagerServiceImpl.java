package com.gs.hdfc.service;

import com.gs.hdfc.bean.Manager;
import com.gs.hdfc.dao.ManagerDAOImpl;
import com.gs.hdfc.util.Utility;

public class ManagerServiceImpl {

	private ManagerDAOImpl managerDAOImpl = new ManagerDAOImpl();

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

	public String[] getProjectStartingWithByManagerId(long id, String startingStr) {

		Manager manager = findById(id);
		String[] projects = manager.getProjects();
		String[] projectsToReturn = new String[projects.length];
		int index = 0;
		for (int i = 0; i < projects.length; i++) {
			if (projects[i].startsWith(startingStr)) {
				projectsToReturn[index] = projects[i];
				index++;
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

}
