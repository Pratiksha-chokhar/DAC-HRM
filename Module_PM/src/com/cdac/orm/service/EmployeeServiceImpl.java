package com.cdac.orm.service;

import java.util.List;

import javax.transaction.Transactional;

import com.cdac.orm.dao.IEmployeeDao;
import com.cdac.orm.exception.CustomException;
import com.cdac.orm.model.Employee;

public class EmployeeServiceImpl implements IEmployeeService {
	private IEmployeeDao empDao;

	@Override
	@Transactional
	public Employee addEmployee(Employee emp) throws CustomException {
		// TODO Auto-generated method stub
		return this.empDao.addEmployee(emp);
	}

	@Override
	@Transactional
	public Employee updateEmployee(Employee emp) throws CustomException {
		// TODO Auto-generated method stub
		return this.empDao.updateEmployee(emp);
	}

	@Override
	@Transactional
	public List<Employee> listEmployees() throws CustomException {
		// TODO Auto-generated method stub
		return this.empDao.listEmployees();
	}

	@Override
	@Transactional
	public Employee getEmpById(int id) throws CustomException {
		// TODO Auto-generated method stub
		return this.empDao.getEmpById(id);
	}

	@Override
	@Transactional
	public Employee removeEmployee(int id) throws CustomException {
		// TODO Auto-generated method stub
		return this.empDao.removeEmployee(id);
	}

}
