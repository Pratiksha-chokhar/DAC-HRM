package com.springhrms.service;

import com.springhrms.model.Employee;
import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;

/**
 *
 * @author Manish gour
 */
public interface EmployeeService {

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public long createEmployee(Employee employee);

    public Employee updateEmployee(Employee employee);

    public void deleteEmployee(long employeeId);

    public List<Employee> getAllEmployees();

    public Employee getEmployee(long employeeId);

}
