package com.springhrms.validator;

import com.springhrms.model.Employee;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class NameValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Employee.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Employee employee = (Employee) target;
        String firstName = employee.getFirstName();
        if (firstName.length() > 5) {
            errors.rejectValue("firstName", "NameLength.employee.firstName");
        }
    }
}
