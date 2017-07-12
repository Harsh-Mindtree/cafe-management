<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee Details</title>
<script type="text/javascript" src = "validation.js"></script>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<script type="text/javascript">
</script>
<body>
	<div class="head-mindtree">Cafe Feedback Portal</div>
	<form id="empform" name="myForm" action="signup.action" method="post"
		onsubmit="return validate()">
		<table>
			<tr>
				<td>Employee Name</td>
				<td><input type="text" name="empName"></td>
			</tr>
			<tr>
				<td>Employee Id</td>
				<td><input type="text" name="empId"></td>
			</tr>
			<tr>
				<td>Employee Designation</td>
				<td><input type="text" name="empDesignation"></td>
			</tr>
			<tr>
				<td>Employee Email</td>
				<td><input type="text" name="empEmail"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="save" value="Submit"
					class="mindtree"></td>
			</tr>
		</table>
	</form>
</body>
</html>