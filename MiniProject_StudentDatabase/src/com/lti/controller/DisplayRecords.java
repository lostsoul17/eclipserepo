package com.lti.controller;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.dao.StudentDao;
import com.lti.model.Student;

/**
 * Servlet implementation class DisplayRecords
 */
@WebServlet("/DisplayRecords")
public class DisplayRecords extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			StudentDao studentDao = new StudentDao();
			//HttpSession session = request.getSession();
			List<Student> list = new ArrayList<Student>();
			list = studentDao.fetch();
			request.setAttribute("list",list);
			request.getRequestDispatcher("studentRecords.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
