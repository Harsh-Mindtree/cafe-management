function validate() {
	var empName = document.forms["myForm"]["empName"].value;
	var empId = document.forms["myForm"]["empId"].value;
	var empCompetency = document.forms["myForm"]["empCompetency"].value;
	var empSubPractice = document.forms["myForm"]["empSubPractice"].value;
	var empVerticle = document.forms["myForm"]["empVerticle"].value;
	if (empName.length == 0) {
		alert("Employee Name cannot be empty");
		return false;
	}
	if (empId.length != 8) {
		alert("Employee Id should be of 8 characters");
		return false;
	}
	if (empCompetency.length != 2) {
		alert("Employee Competency should be of 2 characters");
		return false;
	}
	if (empSubPractice.length == 0) {
		alert("Employee Sub Practice cannot be empty");
		return false;
	}
	if (empVerticle.length == 0) {
		alert("Employee Verticle cannot be empty");
		return false;
	}
}