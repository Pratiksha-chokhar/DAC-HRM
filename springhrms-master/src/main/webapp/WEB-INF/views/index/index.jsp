<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<h2>Welcome</h2>
<p>
	<spring:message code="welcome" />
	<security:authorize access="isAuthenticated()">
		<security:authentication property="principal.username" />
	</security:authorize>
</p>