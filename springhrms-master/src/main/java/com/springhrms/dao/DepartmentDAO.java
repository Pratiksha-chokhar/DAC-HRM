package com.springhrms.dao;

import com.springhrms.model.Department;
import java.util.List;

/**
 *
 * @author Manish gour
 */
public interface DepartmentDAO {

    public long createDepartment(Department department);

    public Department updateDepartment(Department department);

    public void deleteDepartment(long id);

    public List<Department> getAllDepartments();

    public Department getDepartment(long id);
}
