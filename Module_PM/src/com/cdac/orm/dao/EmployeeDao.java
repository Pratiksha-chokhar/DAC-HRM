package com.cdac.orm.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cdac.orm.exception.CustomException;
import com.cdac.orm.model.Employee;

public class EmployeeDao implements IEmployeeDao {
	
	private static final Logger logger = 			
			LoggerFactory.getLogger(EmployeeDao.class);
	@Autowired
	private SessionFactory sessionFactory;
   
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public Employee addEmployee(Employee emp) throws CustomException {
		
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(emp);
		logger.info("Emplyee saved successfully, Person Details="
		+ emp);
		return emp;
		
		
	}

	@Override
	public Employee updateEmployee(Employee emp) throws CustomException {
		Session session = 
				this.sessionFactory
				.getCurrentSession();
		session.update(emp);
		logger.info("Person updated successfully, "
				+ "Person Details=" + emp);
		return emp;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> listEmployees() throws CustomException {
		Session session = this.sessionFactory.getCurrentSession();
		List<Employee> empList = session.createQuery("from Employee").list();
		for (Employee e : empList) {
			logger.info("Employee List::" + e);
		}
		return empList;
	}

	@Override
	public Employee getEmpById(int id) throws CustomException {
		Session session = this.sessionFactory.getCurrentSession();
		Employee e = (Employee) session.load(Employee.class, new Integer(id));
		logger.info("Person loaded successfully, Person details=" + e);
		return e;
	}

	@Override
	public Employee removeEmployee(int id) throws CustomException {
		Session session = this.sessionFactory.getCurrentSession();
		Employee emp = 
		(Employee) session.load(Employee.class, new Integer(id));
		if (null != emp) {
			session.delete(emp);
		}else {
			logger.error
			("Person NOT deleted, with person Id=" +id);
		}
		logger.info("Person deleted successfully, person details=" + emp);
		return emp;
	}

}
