<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Employee</title>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<link rel="stylesheet" href="/resources/demos/style.css">
<script type="text/javascript">
$(function() {
	$('#txtCalendarDate1').datepicker({
		dateFormat : 'yy-mm-dd'
	});
	 $('#txtCalendarDate1').datepicker();
}); 
</script>
</head>
<body>
<center>
	<form action="addUserData">
		<table>
			<tr>
				<td><h3>Employee Name:<input type="text" name="employeeName"></h3></td></tr>
				<tr><td><h3>Employee Code:<input type="text" name="employeeCode"></h3></td></tr>
				<tr><td><h3>Employee Address:<input type="text" name="employeeAddress"></h3></td></tr>
				<tr><td><h3>Employee Password:<input type="text"name="employeePassword"></h3></td></tr>
 				<!-- <tr><td><h3>Employee Role:<input type="text" name="employeeRole"></h3></td></tr> -->
 				<tr><td><h3>Employee No Of Leave:<input type="text" name="employeeNoOfLeave"></h3></td></tr>
				<td><h3>Employee Joining Date:<input type="text" id="txtCalendarDate1" name="dateOfJoining"></h3></td>
				
				
				<tr><td><h2><select name="managerId">
				<option value="-1">---select Manager ---</option>
					<core:forEach var="emp" items="${managerList}">
						<option value="${emp.empId}">${emp.empName}</option>
					</core:forEach>
				</select>
				
				<select name = "employeeRole">
				<option value="-1">---select Employee Role---</option>
					<core:forEach var="empRole" items="${roleList}">
						<option value="${empRole}">${empRole}</option>
					</core:forEach>
				</select></h2>
				</td>
			</tr>
			
			<tr><td><input type="submit" value="click"></td></tr>
			
		</table>
	</form>
	</center>
</body>
</html>