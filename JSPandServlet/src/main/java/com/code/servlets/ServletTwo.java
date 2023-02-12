package com.code.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTwo
 */
@WebServlet("/servletTwo")
public class ServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTwo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Cookie[]  cookies =   request.getCookies();
		if(cookies != null && cookies.length > 0) {
			
			for(Cookie cookie : cookies) {
				String userName = cookie.getName();
				
				if(userName.equalsIgnoreCase("userName")) {
					response.getWriter().println("Welcome Back "+cookie.getValue());
				}
			}
		}else {
			response.getWriter().println("User Info Not found Please log in first.");
			
		}
		
		doGet(request, response);
	}

}
