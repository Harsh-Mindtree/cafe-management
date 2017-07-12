<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Menu Page</title>
</head>
<body>
	<h1><u>Todays Menu</u></h1>
	
<div class="container">
<div class="table-responsive">
	<table class="table table-bordered">
		<tr>
			<th>Type</th>
			<th>Menu Item</th>
			<th>Items</th>
			<th>Click to add feedback</th>
		</tr>
		<c:forEach items="${menuList}" var="i">
			<tr>
				<td>${i.type}</td>
				<td>${i.menu_Item}</td>
				<td>${i.items}</td>
				
				<%-- <td><c:out value="${i.number}"/><td> --%>

				<td><a
					href="SubmitFeedback.jsp?id=<c:out value="${i.number}"/>">
						Click</a></td>
			</tr>
		</c:forEach>
	</table>
	 </div>
</div>
	
	<br> <br> <br>
	
	<a href = "ViewFeedback.action" > Click here to view feedback</a>

<br> <br> <br>

<a href = "HomePage.jsp" > Return to Home </a>

<br><br><br>

<a href = "LogOut.do"> Logout</a>
</body>
</html>
