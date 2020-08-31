package com.dxc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.dxc.beans.Employee;

public class EmployeeHibDao implements EmployeeDao {
	
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
		System.out.println("inside employeehibdao sessionFactory : "+sessionFactory);
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

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	public Employee insert(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Trying to insert : "+employee);
		session.save(employee);
		System.out.println("Inserted successfully : "+employee);
		return employee;
	}



	public com.dxc.beans.Employee find(int eid) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee udpate(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean delete(int eid) {
		// TODO Auto-generated method stub
		return false;
	}




}