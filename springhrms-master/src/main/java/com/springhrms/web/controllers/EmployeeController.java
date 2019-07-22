package com.springhrms.web.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springhrms.model.Employee;
import com.springhrms.model.Job;
import com.springhrms.service.EmployeeService;
import com.springhrms.service.JobService;
import com.springhrms.validator.NameValidator;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	private static final String VIEWS_EMPLOYEE_CREATE_FORM = "addEmployee";
	private static final String VIEWS_EMPLOYEE_LIST_VIEW = "listEmployee";
	private static final String VIEWS_EMPLOYEE_EDIT_FORM = "editEmployee";
	private static final String VIEWS_EMPLOYEE_DELETE_FORM = "deleteEmployee";

	@Autowired
	EmployeeService employeeService;

	@Autowired
	JobService jobService;

	@Autowired
	private MessageSource messageSource;
        
        //This is an example of custom validator
	@Autowired
	private NameValidator nameValidator;
        
        
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dateFormat.setLenient(false);
		webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
                webDataBinder.setValidator(nameValidator);
	}

	@ModelAttribute("jobs")
	public List<Job> populateJobTypes() {
		return jobService.getAllJobs();
	}

	@RequestMapping(value = { "/list" }, method = RequestMethod.GET)
	public ModelAndView listEmployee() {
		ModelAndView mav = new ModelAndView(VIEWS_EMPLOYEE_LIST_VIEW);
		List<Employee> allEmployee = employeeService.getAllEmployees();
		mav.addObject("employees", allEmployee);
		return mav;
	}

	@RequestMapping(value = { "/add" }, method = RequestMethod.GET)
	public ModelAndView createEmployee() {
		ModelAndView mav = new ModelAndView(VIEWS_EMPLOYEE_CREATE_FORM);
		Employee employee = new Employee();
		mav.addObject("employee", employee);
		return mav;
	}

	@RequestMapping(value = { "/save" }, method = RequestMethod.POST)
	public String saveEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult result,
			RedirectAttributes redirectAttributes) {
		if (result.hasErrors()) {
			return VIEWS_EMPLOYEE_CREATE_FORM;
		}
		employeeService.createEmployee(employee);
		redirectAttributes.addFlashAttribute("message",
				messageSource.getMessage("operationMessage.employeeAddSuccess", new String[] {}, Locale.US));
		return "redirect:/employee/list";
	}

	@RequestMapping(value = { "/edit/{employeeId}" }, method = RequestMethod.GET)
	public ModelAndView editEmployee(@PathVariable Integer employeeId) {
		ModelAndView mav = new ModelAndView(VIEWS_EMPLOYEE_EDIT_FORM);
		Employee employee = employeeService.getEmployee(employeeId);
		mav.addObject("employee", employee);
		return mav;
	}

	@RequestMapping(value = { "/update" }, method = RequestMethod.POST)
	public String updateEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult result,
			RedirectAttributes redirectAttributes) {
		if (result.hasErrors()) {
			return VIEWS_EMPLOYEE_EDIT_FORM;
		}
		employeeService.updateEmployee(employee);
		redirectAttributes.addFlashAttribute("message",
				messageSource.getMessage("operationMessage.employeeEditSuccess", new String[] {}, Locale.US));
		return "redirect:/employee/list";
	}

	@RequestMapping(value = { "/delete/{employeeId}" }, method = RequestMethod.GET)
	public ModelAndView deleteEmployee(@PathVariable Integer employeeId) {
		ModelAndView mav = new ModelAndView(VIEWS_EMPLOYEE_DELETE_FORM);
		Employee employee = employeeService.getEmployee(employeeId);
		mav.addObject("employee", employee);
		return mav;
	}

	@RequestMapping(value = { "/deleteProcess" }, method = RequestMethod.POST)
	public String deleteProcessEmployee(@ModelAttribute("employee") Employee employee,
			RedirectAttributes redirectAttributes) {
		int employeeId = (int) employee.getEmployeeId();
		if (employeeId != 0) {
			employeeService.deleteEmployee(employeeId);

			redirectAttributes.addFlashAttribute("message",
					messageSource.getMessage("operationMessage.employeeDeleteSuccess", new String[] {}, Locale.US));
		} else {
			redirectAttributes.addFlashAttribute("message",
					messageSource.getMessage("operationMessage.employeeDeleteError", new String[] {}, Locale.US));
		}
		return "redirect:/employee/list";
	}

        @RequestMapping(value = "/getSalary", method = RequestMethod.GET)
        public @ResponseBody List<String> salariesForJob(@RequestParam(value = "jobName", required = true) String jobName) {
                List<String> salaries = new ArrayList<String>();
                Job salariesList = this.jobService.getJob(jobName);
                salaries.add(Double.toString(salariesList.getMaxSalary()));
                salaries.add(Double.toString(salariesList.getMinSalary()));
                return  salaries;
        }

}
