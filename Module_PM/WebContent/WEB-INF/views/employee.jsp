<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>Employee Page</title>
<link
	href="${pageContext.request.contextPath}/WEB-INF/styles/mystyle.css"
	rel="stylesheet" />
<link
	href="${pageContext.request.contextPath}/WEB-INF/webjars/css/bootstrap.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src=""WebContent/WEB-INF/web.xml"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<style>
.errors {
	color: red;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body>
	
	<div class="container"><h1>Add a Employee</h1>
		<c:url var="addAction" value="/emp/add"></c:url>
		<div class="form-group">
		<form:form action="${addAction}" modelAttribute="emp">
			<table class="table">
				<c:if test="${!empty emp.empname}">
					<tr>
						<td><form:label path="empcode">
								<spring:message text="emp ID" />
							</form:label></td>
						<td><form:input path="empcode" readonly="true" size="8"
								disabled="true" /> <form:hidden path="empcode" /></td>
					</tr>
				</c:if>
				<tr>
					<td><form:label path="empname">
							<spring:message text="Emp Name" />
						</form:label></td>
					<td><form:input path="empname" /> <form:errors path="name"
							cssClass="errors"></form:errors></td>
				</tr>
				<tr>
					<td><form:label path="doj">
							<spring:message text="Date of joining" />
						</form:label></td>
					<td><form:input path="doj" /> <form:errors path="doj"
							cssClass="errors"></form:errors></td>
				</tr>
				
				<tr>
					<td><form:label path="exp">
							<spring:message text="total exp" />
						</form:label></td>
					<td><form:input path="exp" /> <form:errors path="exp"
							cssClass="errors"></form:errors></td>
				</tr>
				<tr>
					<td><form:label path="designation">
							<spring:message text="designation" />
						</form:label></td>
					<td><form:input path="designation" /> <form:errors path="designation"
							cssClass="errors"></form:errors></td>
				</tr>
				<tr>
					<td><form:label path="grade">
							<spring:message text="grade" />
						</form:label></td>
					<td><form:input path="grade" /> <form:errors path="grade"
							cssClass="errors"></form:errors></td>
				</tr>
				<tr>
					<td><form:label path="comments">
							<spring:message text="comments" />
						</form:label></td>
					<td><form:input path="comments" /> <form:errors path="comments"
							cssClass="errors"></form:errors></td>
				</tr>
				<tr>
					<td><form:label path="resourcetype">
							<spring:message text="resurce type" />
						</form:label></td>
					<td><form:input path="resourcetype" /> <form:errors path="resourcetype"
							cssClass="errors"></form:errors></td>
				</tr>
				<tr>
					<td><form:label path="projectid">
							<spring:message text="Project Id" />
						</form:label></td>
					<td><form:input path="projectid" /> <form:errors path="projectid"
							cssClass="errors"></form:errors></td>
				</tr>
				<tr>
					<td colspan="2"><c:if test="${!empty emp.name}">
							<input type="submit"
								value="<spring:message 
					text="Edit Person"/>" />
						</c:if> <c:if test="${empty emp.name}">
							<input type="submit" class="btn btn-success"
								value="<spring:message 
					text="Add employee"/>" />
						</c:if></td>
				</tr>
			</table>
			<img src="cinqueterre.jpg" class="img-circle" alt="Cinque Terre">
		</form:form>
		</div>
		<br>
		<div class="con"></div>
		<h3>Employee List</h3>
		<c:if test="${!empty listemployee}">
			<table class="table">
				<tr>
					<th width="80">empcode</th>
					<th width="120">empname</th>
					<th width="120">doj</th>
					<th width="120">exp</th>
					<th width="120">designation</th>
					<th width="120">grade</th>
					<th width="120">comments</th>
					<th width="120">resourcetype</th>
					<th width="120">projectid</th>
					
					<th width="60">Edit &nbsp;&nbsp;&nbsp;Delete</th>
				</tr>
				<c:forEach items="${listEmployee}" var="emp">
					<tr>
						<td>${emp.empcode}</td>
						<td>${emp.empname}</td>
						<td>${emp.doj}</td>
						<td>${emp.exp}</td>
						<td>${emp.designation}</td>
						<td>${emp.grade}</td>
						<td>${emp.comments}</td>
						<td>${emp.resourcetype}</td>
						<td>${emp.prjectid}</td>
						<td><button class="btn btn-warning">
								<a href="
			<c:url value='/edit/${emp.empcode}' />" style="color:black">Edit</a>
							</button>&nbsp;<button class="btn btn-danger">
								<a href="
			<c:url value='/remove/${emp.empcode}' />" style="color:black">Delete</a>
							</button></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
	</div>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/WEB-INF/webjars/js/bootstrap.js"></script>
</body>
</html>
