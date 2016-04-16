<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Leave Request</title>
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
		$('#txtCalendarDate2').datepicker({
			dateFormat : 'yy-mm-dd'
		});
		$('#txtCalendarDate2').datepicker();
	});
</script>
</head>
<body>
<center>
	<form action="leaveForRequest">

			<table>
				<tr>
					<td><h2>From<input type="text" id="txtCalendarDate1"
						name="leaveFrom"></h2></td>
					<td><h2>To<input type="text" id="txtCalendarDate2" name="leaveTo"></h2></td></tr>
					<tr><td><h2><input type="submit" value="--Submit Leave Request--"></h2></td>
				</tr>
			</table>
	</form>
	</center>
</body>
</html>