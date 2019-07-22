package com.springhrms.service;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.springhrms.dataseeders.EmployeeDataSeeders;
import com.springhrms.model.Employee;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@TransactionConfiguration(transactionManager = "transactionManager")
@ContextConfiguration(locations = { "classpath*:application-context-test.xml" })
public class EmployeeServiceTest {

	@Autowired
	EmployeeService employeeService;

	@Before
	public void setup() {

	}

	@Test
	@Rollback
	public void testCreateEmployee() {
		Employee employee = EmployeeDataSeeders.generateEmployee();
		employeeService.createEmployee(employee);
		assertEquals("Krishnaa", employeeService.getEmployee(employee.getEmployeeId()).getFirstName());
	}

	@Test
	@Rollback
	public void testGetEmployee() {
		Employee employee = EmployeeDataSeeders.generateEmployee();
		employeeService.createEmployee(employee);
		assertEquals("Krishnaa", employeeService.getEmployee(employee.getEmployeeId()).getFirstName());
	}

	@Test
	@Rollback
	public void testUpdateEmployee() {
		Employee employee = EmployeeDataSeeders.generateEmployee();
		employeeService.createEmployee(employee);
		employee.setFirstName("Mohan");
		employeeService.updateEmployee(employee);
		assertEquals("Mohan", employeeService.getEmployee(employee.getEmployeeId()).getFirstName());
	}

	@Test
	@Rollback
	public void testDeleteEmployee() {
		Employee employee = EmployeeDataSeeders.generateEmployee();
		employeeService.createEmployee(employee);
		employeeService.deleteEmployee(employee.getEmployeeId());
		assertEquals(0l, employeeService.getAllEmployees().size());
	}

	@Test
	@Rollback
	public void testGetAllEmployees() {
		Employee employee = EmployeeDataSeeders.generateEmployee();
		employeeService.createEmployee(employee);
		assertEquals(1l, employeeService.getAllEmployees().size());
	}

	@After
	public void tearDown() {
		this.employeeService = null;
	}
}
