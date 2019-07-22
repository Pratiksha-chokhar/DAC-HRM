<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" charset="utf-8" />
<link href="<c:url value='/resources/css/php_hol.css'  />"
	rel="stylesheet" />
<title>Spring HRMS Company Portal:: Exception Occurred </title>
<style>
.error {
	font-size: 11px;
	padding: 5px;
	margin-bottom: 15px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #a94442;
	background-color: #f2dede;
	border-color: #ebccd1;
}
</style>
</head>
<body>
	<div>
		<tiles:insertAttribute name="body" />
	</div>
</body>
</html>