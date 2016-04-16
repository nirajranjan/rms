<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">
/* $(document).ready(function () {
	//$('#submit').click(function(){
	var username=$('#uname').val();
	var password=$('#pwd').val();

	if(username=="")
	{
	$('#dis').slideDown().html("<span>Please type Username</span>");
	return false;
	}
	if(password=="")
	{
	$('#dis').slideDown().html('<span id="error">Please type Password</span>');
	return false;
	}
	//});
}); */
	
</script>
</head>
<body>
	<form action="login" method="POST">
		<center>
		<label id="dis"></label><br>
			<table>
				<tr>
					<td>LoginId:<input type="text" name="userName" id="uname"></td>
					<td>Password:<input type="text" name="password" id="pwd"></td>
					<td><input type="submit" value="click"></td>
				</tr>
			</table>
		</center>
	</form>
</body>
</html>