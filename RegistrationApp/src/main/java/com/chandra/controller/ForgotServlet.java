package com.chandra.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chandra.dao.RegisterDAO;
import com.chandra.dao.RegisterDAOImpl;

/**
 * Servlet implementation class ForgotServlet
 */
public class ForgotServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForgotServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		RegisterDAO dao = new RegisterDAOImpl();
		String userName = request.getParameter("uname");
		String type = request.getParameter("type");
		String passWord = dao.forgot(userName, type);
		if(passWord!=null) {
			out.println("<h1>Your Forgot PassWord = "+passWord+"</h1");
			RequestDispatcher rd = request.getRequestDispatcher("./login.html");
			rd.include(request, response);
		}else {
			out.println("<h1>User doesn't exit....</h1>");
			RequestDispatcher rd = request.getRequestDispatcher("./register.html");
			rd.include(request, response);
			
		}
	}

}
