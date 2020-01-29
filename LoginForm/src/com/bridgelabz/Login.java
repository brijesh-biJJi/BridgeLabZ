package com.bridgelabz;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.dao.LoginDao;

/**
 * Servlet implementation class Login
 */

public class Login extends HttpServlet {


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		LoginDao ld=new LoginDao();
		if(ld.check(uname, pass))
		{
			HttpSession s=request.getSession();
			s.setAttribute("username", uname);
			res.sendRedirect("welcome.jsp");
		}
		else
			res.sendRedirect("index.jsp");
	}

}
