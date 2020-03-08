<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello world-input form</title>
<!--  <link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/my-test.css">
<script
	src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>-->
</head>
<body>
	<img
		src="${pageContext.request.contextPath}/resources/images/Spring_Framework_logo_01.png">
	<form action="processFormVersionThree" method="GET">
		First Name<input type="text" name="studentName" placeholder="What's your name" />
		<input type="submit" />
	</form>
</body>
</html>