<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Remove Student</title>
</head>
<body>
	<form action="DeleteRecord">
		<label>Roll No</label> 
			<input type="text" name="rollNo" required/> <br>
		<button type="submit" name="delete">Remove Student</button><br>
	</form>
	<form action="DisplayRecords">
		<button type="submit" name="display">Display Student Records</button>
	</form>
</body>
</html>