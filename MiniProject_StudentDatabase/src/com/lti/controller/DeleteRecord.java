package com.lti.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.lti.dao.StudentDao;

/**
 * Servlet implementation class DeleteRecord
 */
@WebServlet("/DeleteRecord")
public class DeleteRecord extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		StudentDao studentDao = new StudentDao();
		PrintWriter out=response.getWriter();
		int rollNo;
		rollNo = Integer.parseInt(request.getParameter("rollNo"));
		int rs = studentDao.delete(rollNo);
		if(rs>0){
			response.sendRedirect("DisplayRecords");
		}
		else
		{out.print("can't delete");
		}

	}
}
