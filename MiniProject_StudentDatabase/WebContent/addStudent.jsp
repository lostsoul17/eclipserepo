<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Student</title>
</head>
<body>
	<h1>Register Student</h1>
	<form action="RegisterServlet">
		<label>Roll No</label> 
			<input type="text" name="rollNo" required/> <br>
		<label>First Name</label>
			<input type="text" name="fname" /> <br>
		<label>Last Name</label>
			<input type="text" name="lname" /> <br>
		<label>Course</label> 
			<input type="text" name="course" /> <br>
		<label>Result</label> 
			<input type="text" name="result" /><br>
		<button type="submit" name="register">Register Student</button><br>
	</form>
	<form action="DisplayRecords">
		<button type="submit" name="display">Display Student Records</button>
	</form>
</body>
</html>