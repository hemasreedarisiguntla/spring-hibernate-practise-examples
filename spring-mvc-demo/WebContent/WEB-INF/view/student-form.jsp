<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student registration form</title>
</head>
<body>
	<!--relative path will be called i.e /student/processStudentForm -->
	<form:form action="processStudentForm" method="GET"
		modelAttribute="student">
		First Name: <form:input path="firstName"
			placeholder="What's your first name" />
		<br />
		<br />
		Last Name: <form:input path="lastName"
			placeholder="What's your last name" />
		<br />
		<br />
		Gender: 
		Male <form:radiobutton path="gender"
			value="Male"/>
		Female <form:radiobutton path="gender"
			value="Female"/>
		<br />
		<br />
		Favorite Languages: 
		<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"/>
		<br />
		<br />
		Operating Systems: 
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
		Windows <form:checkbox path="operatingSystems" value="Windows"/>
		<br />
		<br />
		Country: <form:select path="country">
		<form:option value="Brazil" label="Brazil"></form:option>
		<form:option value="France" label="France"></form:option>
		<form:option value="Germany" label="Germany"></form:option>
		<form:option value="India" label="India"></form:option>
		</form:select>
		<br />
		<br />
		City: <form:select path="city">
		<form:options items="${student.cityOptions}"></form:options>
		</form:select>
		<br />
		<br />
		Favorite places: <form:select path="place">
		<form:options items="${favoritePlaces}"></form:options>
		</form:select>
		<br />
		<br />
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>