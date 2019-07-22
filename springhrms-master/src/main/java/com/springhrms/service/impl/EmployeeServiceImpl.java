package com.springhrms.service.impl;

import com.springhrms.dao.EmployeeDAO;
import com.springhrms.model.Employee;
import com.springhrms.service.EmployeeService;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Manish gour
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	@Transactional
	public long createEmployee(Employee employee) {
		return employeeDAO.createEmployee(employee);
	}

	@Override
	@Transactional
	public Employee updateEmployee(Employee employee) {
		return employeeDAO.updateEmployee(employee);
	}

	@Override
	@Transactional
	public void deleteEmployee(long employeeId) {
		employeeDAO.deleteEmployee(employeeId);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}

	@Override
	@Transactional(readOnly = true)
	public Employee getEmployee(long employeeId) {
		return employeeDAO.getEmployee(employeeId);
	}

}
