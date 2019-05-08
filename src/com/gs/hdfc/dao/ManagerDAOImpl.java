package com.gs.hdfc.dao;

import java.util.List;

import com.gs.hdfc.bean.Manager;
import com.gs.hdfc.util.VirtualDatabaseUtil;

public class ManagerDAOImpl {

	// create
	public void save(Manager manager) {
		// we will iterate the whole array
		// we will check for first empty slot
		List<Manager> managerTable = VirtualDatabaseUtil.getManagerTable();
		// need to scan complete table
		managerTable.add(manager);
	}

	// read
	// findById
	public Manager findById(long id) {
		Manager managerObjToReturn = null;
		// need to get manager table
		List<Manager> managers = VirtualDatabaseUtil.getManagerTable();
		for (Manager manager : managers) {

			if (manager.getManagerId() == id) {
				managerObjToReturn = manager;
				break;
			}

		}

		return managerObjToReturn;
	}

	// findAll
	public List<Manager> findAll() {
		return VirtualDatabaseUtil.getManagerTable();
	}

	// update
	// delete

}
