<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>

<p>Manage Employees</p>

<security:authorize access="hasRole('ROLE_ADMIN')">
	<a href="<c:url value='/employee/add' />">Add New Employee</a>
</security:authorize>

<span class="success">${message}</span>
<table id="employee_list_table">
	<tr>
		<th>Email</th>
		<th>Job Title</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Phone Number</th>
		<th>ID</th>
	</tr>
	<c:forEach items="${employees}" var="employee">
		<tr>
			<td><a
				href="<c:url value='${pageContext.request.contextPath}/employee/edit/${employee.employeeId}' />">
					${employee.email} </a></td>
			<td>${employee.job.jobTitle}</td>
			<td>${employee.firstName}</td>
			<td>${employee.lastName}</td>
			<td>${employee.phoneNumber}</td>
			<td><a
				href="<c:url value='${pageContext.request.contextPath}/employee/delete/${employee.employeeId}' />">Delete</a></td>
		</tr>
	</c:forEach>
</table>