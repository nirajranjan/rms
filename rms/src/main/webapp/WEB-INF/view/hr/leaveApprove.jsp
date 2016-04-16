<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Leave Approval</title>
</head>
<body>
<form action="leaveApporavalUser">

		
		 <%--    <select name="employeeLeaveApproval">
				<option value="-1">---select Manager ---</option>
					<core:forEach var="leaveApproval" items="${employeeLeaveApproval}">
						<option value="${leaveApproval.empId}">${leaveApproval.empName}</option>
					</core:forEach>
				</select>
				 --%>
				
				
				<div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of users</h2></caption>
            <tr>
                <th>LeaveRequestFrom</th>
                <th>LeaveRequestTo</th>
                <th>Employee Name</th>
                <th>Employee Code</th>
                <th>Employee Total No Of Leave</th>
                <th>Employee Requested No Of Leave</th>
                <td>Leave Request Status</td>
            </tr>
            <!-- <select name="employeeLeaveApproval"> -->
            <core:forEach var="leaveApproval" items="${employeeLeaveApproval}">
                <tr>
                    <td>${leaveApproval.requestLeaveFrom}</td>
                   <td>${leaveApproval.requestLeaveTo}</td>
                    <td>${leaveApproval.employeName}</td>
                    <td>${leaveApproval.employeeCode}</td>
                    <td>${leaveApproval.totalNumberOfLeave}</td>
                    <td>${leaveApproval.requestNumberOfLeave}</td>
                    <!-- <td><input type="radio" name="statusApproved"/></td>
                    <td><input type="radio" name="statusApproved" checked="checked"/></td> -->
                     	
			           <td>Approved:<INPUT TYPE="radio" NAME="radios" VALUE="statusApproved"></td>
			            <td>Rejected:<INPUT TYPE="radio" NAME="radios" VALUE="statusRejected"></td>
                </tr>
            </core:forEach>
</table>

</form>
</body>
</html>