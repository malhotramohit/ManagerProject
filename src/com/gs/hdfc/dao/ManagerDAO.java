package com.gs.hdfc.dao;

import com.gs.hdfc.bean.Manager;

public interface ManagerDAO {

		// create
		public void save(Manager manager);
		// findById
		public Manager findById(long id);
		// findAll
		public Manager[] findAll();
		//update
		public Manager[] update(Manager manager);
		// delete
		public Manager delete(Manager manager);

}
