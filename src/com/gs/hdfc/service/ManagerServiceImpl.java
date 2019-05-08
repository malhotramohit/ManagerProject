package com.gs.hdfc.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

	public List<Manager> findAll() {
		return managerDAOImpl.findAll();
	}

	public List<String> getProjectStartingWithByManagerId(long id, String startingStr) {

		Manager manager = findById(id);
		List<String> projects = manager.getProjects();
		List<String> projectsToReturn = new ArrayList<String>(projects.size());

		Iterator<String> iterator = projects.iterator();
		while (iterator.hasNext()) {
			String project = iterator.next();
			if (project.startsWith(startingStr)) {
				projectsToReturn.add(project);
			}
		}

		return projectsToReturn;

	}

	public List<Manager> getAllManagerByEvenAge() {

		List<Manager> managers = managerDAOImpl.findAll();
		List<Manager> managers2Return = new ArrayList<Manager>(managers.size());

		for (Manager manager : managers) {
			if (Utility.isEvenNumber(manager.getAge())) {
				managers2Return.add(manager);
			}
		}

		return managers2Return;

	}

}
