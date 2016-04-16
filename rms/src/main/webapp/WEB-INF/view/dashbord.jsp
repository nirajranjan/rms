<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="logout">logout</a>
<table>
<tr>

<c:choose>
    <c:when test="${employeeRole == 'manager'}">
       <td><a href="leaveRequestUser">Leave Request</a></td>
       <td><a href="leaveApporavalUser">Leave Approval</a></td>
    </c:when>
    <c:when test="${employeeRole == 'employee'}">
       <td><a href="leaveRequestUser">Leave Request</a></td>
    </c:when>
    <c:when test="${employeeRole == 'hroperation'}">
    <td><a href="addUser">Add</a></td>
    <td><a href="deleteUser">Delete</a></td>
        <td><a href="leaveRequestUser">Leave Request</a></td>
    </c:when>
</c:choose>

</tr>
</table>
</body>
</html>