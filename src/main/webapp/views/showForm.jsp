<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
	<h1>Customer Registration Form</h1>
	<form:form action="registerCustomer" modelAttribute="customer">
		<table>
			<form:hidden path="id"/>
			<tr>
				<th>Customer first name</th>
				<td><form:input path="firstName"/></td>
			</tr>
			<tr>
				<th>Customer last name</th>
				<td><form:input path="lastName"/></td>
			</tr>
			<tr>
				<th>Customer city name</th>
				<td><form:input path="city"/></td>
			</tr>
			
			<tr><td><input type="submit" value="Register"/></td></tr> 
		</table>
	</form:form>
	 
	
	
</body>
</html>