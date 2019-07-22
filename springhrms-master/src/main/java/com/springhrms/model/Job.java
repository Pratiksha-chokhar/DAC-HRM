package com.springhrms.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "jobs")
@org.hibernate.annotations.Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Job {

	@Id
	@Column(name = "job_id", unique = true, nullable = false)
	private String jobId;

	@Column(name = "job_title")
	private String jobTitle;

	@Column(name = "min_salary")
	private double minSalary;

	@Column(name = "max_salary")
	private double maxSalary;

	@OneToMany(mappedBy = "job", cascade = CascadeType.ALL)
	private Set<Employee> employees;

	@OneToMany(mappedBy = "job", cascade = CascadeType.ALL)
	private Set<JobHistory> jobhistories;

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public double getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(double minSalary) {
		this.minSalary = minSalary;
	}

	public double getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(double maxSalary) {
		this.maxSalary = maxSalary;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	public Set<JobHistory> getJobhistories() {
		return jobhistories;
	}

	public void setJobhistories(Set<JobHistory> jobhistories) {
		this.jobhistories = jobhistories;
	}
	
	@Override
	public String toString() {
		return "id=" + jobId + ", title=" + jobTitle ;
	}
	
}
