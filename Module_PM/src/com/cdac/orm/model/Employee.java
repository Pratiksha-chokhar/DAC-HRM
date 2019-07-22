package com.cdac.orm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name="empcode")
	@GeneratedValue(strategy=GenerationType.AUTO)
	int empcode;
	String empname;
	String  doj;
	int  Exp;
	String designation;
	String grade;
	String comments;
	String resourcetype;
	int projectid;
	public Employee(int empcode, String empname, String doj, int exp, String designation, String grade, String comments,
			String resourcetype, int projectid) {
		super();
		this.empcode = empcode;
		this.empname = empname;
		this.doj = doj;
		Exp = exp;
		this.designation = designation;
		this.grade = grade;
		this.comments = comments;
		this.resourcetype = resourcetype;
		this.projectid = projectid;
	}
	public int getEmpcode() {
		return empcode;
	}
	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public int getExp() {
		return Exp;
	}
	public void setExp(int exp) {
		Exp = exp;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getResourcetype() {
		return resourcetype;
	}
	public void setResourcetype(String resourcetype) {
		this.resourcetype = resourcetype;
	}
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	
	

}
