package com.gs.hdfc.service;

import com.gs.hdfc.bean.Project;
import com.gs.hdfc.dao.ProjectDAO;
import com.gs.hdfc.dao.ProjectDAOImpl;

public class ProjectServiceImpl {
	private ProjectDAO ProjectDAOImpl = new ProjectDAOImpl();

	public Project[] findAll() {
		return ProjectDAOImpl.findAll();
	}

	public void save(Project project) {
		// Dao layers save
		ProjectDAOImpl.save(project);
	}
}
