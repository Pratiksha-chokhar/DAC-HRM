<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url var="loginUrl" value="/login" />
<div id="login-box">

	<h4>Login to Spring HRMS</h4>


	<form action="${loginUrl}" method='POST'>

		<c:if test="${param.error != null}">
			<div class="error">
				<p>Invalid username and password.</p>
			</div>
		</c:if>
		<c:if test="${param.logout != null}">
			<div class="error">
				<p>You have been logged out successfully.</p>
			</div>
		</c:if>

		<table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='username'></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="submit" /></td>
			</tr>
		</table>

		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />

	</form>
</div>

