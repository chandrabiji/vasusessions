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
import com.chandra.model.Users;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Users user = new Users();
		user.setUserName(request.getParameter("uname"));
		user.setPassWord(request.getParameter("pass"));
		RegisterDAO dao = new RegisterDAOImpl();
		String result = dao.login(user);
		if(result.equals("Success")) {
			out.println("<center><h1>Welcome to Our Website</h1></center>");
		}else {
			out.println("Login Failed.Please try again....");
			RequestDispatcher rd = request.getRequestDispatcher("./login.html");
			rd.include(request, response);
		}
		
	}

}
