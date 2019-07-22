package com.springhrms.dao.impl;

import com.springhrms.dao.EmployeeDAO;
import com.springhrms.exception.EmployeeNotFoundException;
import com.springhrms.model.Employee;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public long createEmployee(Employee employee) {
		Long newKey = (Long) sessionFactory.getCurrentSession().save(employee);
		return newKey.longValue();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);
		return employee;
	}

	@Override
	public void deleteEmployee(long employeeId) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Employee WHERE employeeId = " + employeeId)
				.executeUpdate();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployees() {
		return (List<Employee>) sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
	}

	@Override
	public Employee getEmployee(long employeeId) {
		Employee employee = (Employee) sessionFactory.getCurrentSession().get(Employee.class, employeeId);
		if (employee == null)
			throw new EmployeeNotFoundException("Employee does not exists");

		return employee;
	}

}
