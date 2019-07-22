package com.springhrms.dataseeders;

import java.util.Date;

import com.springhrms.model.Department;
import com.springhrms.model.Employee;
import com.springhrms.model.Job;

public class EmployeeDataSeeders {

	@SuppressWarnings("deprecation")
	public static Employee generateEmployee() {
		Employee employee = new Employee();
		employee.setFirstName("Krishnaa");
		employee.setLastName("Yadav");
		employee.setEmail("krishnaa@world.com");
		employee.setHireDate(new Date("01/01/2001"));

		Department department = new Department();
		department.setDepartmentId(10);

		employee.setDepartment(department);

		Job job = new Job();
		job.setJobId("AD_PRES");

		employee.setJob(job);

		return employee;
	}
}
