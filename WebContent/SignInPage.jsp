<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<script type="text/javascript" src="validation.js"></script>
</head>
<body>
	<h1>Employee Login</h1>
	<div id="login">
		<form id="loginForm" name="loginForm" action="login.action" method="post">
			<table>
				<tr>
					<td>Employee Email</td>
					<td><input type="text" name="empEmail" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td></td>
				<tr>
					<td>
					<td><input type="submit" name="submit" value="Login"
						onclick="return validate()"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>