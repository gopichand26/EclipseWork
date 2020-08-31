package com.dxc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.dxc.beans.Department;

public class DepartmentHibDao implements DepartmentDao {

	@Autowired
	SessionFactory sessionFactory ;
	Session session;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void openSession(){
		System.out.println("inside departmenthibdao sessionFactory : "+sessionFactory);
		session = getSessionFactory().openSession();
	}
	
	public void closeSession(){
		session.close();
	}
	
	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	@SuppressWarnings("unchecked")
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		String sql = "from Department";
		Query query = session.createQuery(sql);
		List<Department> departments = query.list();
		return departments;
	}

	public Department find(int did) {
		// TODO Auto-generated method stub
		return null;
	}

	public Department insert(Department department) {
		// TODO Auto-generated method stub
		System.out.println("Before inserting "+department.getDname());
		session.save(department);
		System.out.println("After inserting "+department.getDname());
		return department;
	}

	public Department udpate(Department department) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean delete(int did) {
		// TODO Auto-generated method stub
		return false;
	}

}