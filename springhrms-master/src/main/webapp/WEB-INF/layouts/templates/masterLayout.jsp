<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" charset="utf-8" />

<title>Spring HRMS Company Portal</title>
<link href="<c:url value='/resources/css/php_hol.css'  />"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-1.6.1.min.js"
			  integrity="sha256-x4Q3aWDzFj3HYLwBnnLl/teCA3RaVRDGmZKjnR2P53Y="
			  crossorigin="anonymous"></script>
<script type="text/javascript"
	src="<c:url value="/resources/javascript/global.js" />"></script>
</head>
<body>
	<h1>Spring HRMS Company Portal</h1>
	<div id="menu">
		<tiles:insertAttribute name="sideNavigation" />
	</div>
	<div id="content">
		<tiles:insertAttribute name="body" />
	</div>

	<div id="footer">
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>