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
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		int id = Integer.parseInt(request.getParameter("uid"));
		String name = request.getParameter("uname");
		String pwd = request.getParameter("pass");
		String type = request.getParameter("type");
		Users user = new Users(id,name,pwd,type);
		RegisterDAO dao = new RegisterDAOImpl();
		int n = dao.register(user);
		if(n!=0) {
			out.println("Successfully User Reigstration Completed....");
			RequestDispatcher rd = request.getRequestDispatcher("./register.html");
			rd.include(request, response);
		}else {
			out.println("Please try again something went wrong");
		}
	}

}