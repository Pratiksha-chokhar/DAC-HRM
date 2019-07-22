package com.springhrms.dao;

import com.springhrms.model.Employee;
import java.util.List;

/**
 *
 * @author Manish gour
 */
public interface EmployeeDAO {

    public long createEmployee(Employee employee);

    public Employee updateEmployee(Employee employee);

    public void deleteEmployee(long employeeId);

    public List<Employee> getAllEmployees();

    public Employee getEmployee(long employeeId);

}
