<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link href="/ElStore/WebContent/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
		<link href="<s:url value="/resources/css/justified-nav.css" />" rel="stylesheet" type="text/css" />
	</head>
	<body>
		<div id="container">
			<div id="top">
				<t:insertAttribute name="top" />
			</div>
			<div id="content">
				<t:insertAttribute name="content" />
			</div>
			<div id="bottom">
				<t:insertAttribute name="bottom" />
			</div>
		</div>
	</body>
</html>
