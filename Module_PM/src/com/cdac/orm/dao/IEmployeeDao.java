package com.cdac.orm.dao;

import java.util.List;

import com.cdac.orm.exception.CustomException;
import com.cdac.orm.model.Employee;

public interface IEmployeeDao {

	
	public Employee addEmployee(Employee emp)throws CustomException;//insert
	public Employee updateEmployee(Employee emp)throws CustomException;//update/modify
	public List<Employee> listEmployees()throws CustomException;//retrieve/listAll
	public Employee getEmpById(int id)throws CustomException;//search
	public Employee removeEmployee(int id)throws CustomException;//delete/remove
}
