<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.lti.model.Student"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Students</title>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr: {
	background-color: #dddddd;
}
</style>
</head>
<body>
	<h2>Student Records</h2>
	<table>
		<tr>
			<th>Roll No</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Course</th>
			<th>Result</th>
		</tr>
		<%
			ArrayList<Student> list = (ArrayList<Student>) request.getAttribute("list");
			for (Student student : list) {
		%>

		<%-- Arranging data in tabular form 
        --%>
		<tr>
			<td><%=student.getRollNo()%></td>
			<td><%=student.getFname()%></td>
			<td><%=student.getLname()%></td>
			<td><%=student.getCourse()%></td>
			<td><%=student.getResult()%></td>
		</tr>
		<%
			}
		%>
	</table>
	<form action="addStudent.jsp">
		<button type="submit" >Add Student</button>
	</form>
	<form action="deleteStudent.jsp">
		<button type="submit" >Remove Student</button>
	</form>
</body>
</html>