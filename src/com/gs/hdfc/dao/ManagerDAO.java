package com.gs.hdfc.dao;

import com.gs.hdfc.bean.Manager;

public interface ManagerDAO {
	public void save(Manager manager);
	public Manager findById(long id);
	public Manager[] findAll();
	public void updateManager(Manager man);
	public void deleteMan();
}
