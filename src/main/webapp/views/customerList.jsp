<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Customer Management Page</title>
</head>
<body>

    <h1>Customer Management Page</h1>

    <!-- Improved Button for Customer Registration -->
    <a href="/crm/showForm">
        <button class="add-button">Register Customer</button>
    </a>

    <table border="1">
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>City</th>
            <th>Update Data</th>
            <th>Delete Data</th>                    
        </tr>
        <c:forEach var="customer" items="${customers}">
            <c:url var="updatelink" value="/updateform">
                <c:param name="customerId" value="${customer.id}"></c:param>
            </c:url>
            <c:url var="deletelink" value="/deleteData">
                <c:param name="customerId" value="${customer.id}"></c:param>
            </c:url>
            <tr>
                <td>${customer.firstName}</td>
                <td>${customer.lastName}</td>
                <td>${customer.city}</td>
                <td>
                    <a href="${updatelink}">Update Info</a>
                </td>
                <td>
                    <a href="${deletelink}">Delete Info</a>  <%-- Fixed incorrect text --%>
                </td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
