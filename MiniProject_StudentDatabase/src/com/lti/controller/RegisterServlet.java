package com.lti.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.dao.StudentDao;
import com.lti.model.Student;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentDao studentDao = new StudentDao();
		Student student = new Student();
		student.setRollNo(Integer.parseInt(request.getParameter("rollNo")));
		student.setFname(request.getParameter("fname"));
		student.setLname(request.getParameter("lname"));
		student.setCourse(request.getParameter("course"));
		student.setResult(request.getParameter("result"));
		studentDao.register(student);
		response.sendRedirect("DisplayRecords");
	}


}
