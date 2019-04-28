package com.gs.hdfc.dao;

import com.gs.hdfc.bean.Project;
import com.gs.hdfc.util.VirtualDatabaseUtil;

public class ProjectDAOImpl implements ProjectDAO{

	public void save(Project project) {
		// Takes value and Saves the project 
		Project[] projectTable = VirtualDatabaseUtil.getProjectTable();
		// need to scan complete table
		int emptySlotNum = 0;
		for (int i = 0; i < projectTable.length; i++) {
			if (projectTable[i] == null) {
				emptySlotNum = i;
				break;
			}
		}

		projectTable[emptySlotNum] = project;

	}

	public void update(Project project) {
		// TODO Auto-generated method stub
		
	}

	public Project findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Project[] findAll() {
		// TODO Auto-generated method stub
		return VirtualDatabaseUtil.getProjectTable();
	}

	public void deleteById(long id) {
		// TODO Auto-generated method stub
		
	}

}
