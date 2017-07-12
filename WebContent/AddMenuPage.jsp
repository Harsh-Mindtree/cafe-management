<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<head>
<title>Add Menu</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>


<body>
	<h1><u>Add Today's Menu here</u></h1>
	<script type="text/javascript">
		function validate() {
			var empName = document.getElementById("menu_item").value;
			if (empName == null || empName == "") {
				alert("Please enter Meal Name");
				return false;
			}

			var empId = document.getElementById("items").value;
			if (empId == null || empId == "") {
				alert("Please enter Items");
				return false;
			}

		}
	</script>

	<form action="AddMenu.addmenu" method="post">

		Select Menu Type : <select name="type">
			<option value="veg">Veg</option>
			<option value="nonveg">Non Veg</option>
		</select> <br>
		<br> Meal Name : <input type="text" name="Menu Item"
			id="menu_item"> <br> <br> Items : <input
			type="text" name="Items" id="items"> <br> <br> <input
			type="submit" name="submit" value="Submit"
			onclick="return validate()"> <br> <br>


	</form>

	<br>
	<br>
	<br>

	<a href="HomePage.jsp"> Return to Home </a>

</body>
</html>