<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security"
           uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form name="logoutForm"
           action="${pageContext.request.contextPath}/logout" method="POST">
</form:form>
<ul>
    <li style="padding: 5px;"><a href="<c:url value='/' />">Home</a></li>
    <li style="padding: 5px;"><a
            href="<c:url value='/employee/list' />">Employee Administration</a></li>

    <security:authorize access="isAuthenticated()">
        <li style="padding: 5px;"><a href="javascript:void(0);"
                                     onclick="document.logoutForm.submit();">Logout</a></li>
        </security:authorize>
</ul>
