/**
 * 
 */
package com.gs.hdfc.dao;

import com.gs.hdfc.bean.Project;

/**
 * @author Hansnath
 *
 */
public interface ProjectDAO {
	
	public void save(Project project);
	public void update(Project project);
	public Project findById(long id);
	public Project[] findAll();
	public void deleteById(long id);
	
}
