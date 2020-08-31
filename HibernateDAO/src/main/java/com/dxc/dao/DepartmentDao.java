package com.dxc.dao;

import java.util.List;

import com.dxc.beans.Department;

public interface DepartmentDao {
	
	List<Department> findAll();
	Department find(int did);
	Department insert(Department department);
	Department udpate(Department department);
	boolean delete(int did);
	
}