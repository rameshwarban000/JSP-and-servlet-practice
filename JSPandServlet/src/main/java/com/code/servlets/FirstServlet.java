package com.code.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.util.ToStringUtil;
import org.apache.tomcat.util.buf.StringUtils;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/firstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FirstServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	 String userName = 	request.getParameter("userName");
	 
	 if(userName != null && (!userName.isEmpty())) {
		 
		 Cookie cookie = new Cookie("userName",userName );
			
			response.addCookie(cookie);
			
			 response.getWriter().println("<html>"); 
			 response.getWriter().println("<head>"); 
			 response.getWriter().println("</head>"); 
			 response.getWriter().println("<body>"); 
			 response.getWriter().println("<form action=\"servletTwo\" method=\"post\">"); 
			 response.getWriter().println("<p>Welcome, "+userName+".</p>"); 
			 response.getWriter().println(""
			 		+ "<button>send</button>"
			 		+ "</form>"); 
			 response.getWriter().println("</body>"); 
			 response.getWriter().println("<footer>"); 
			 response.getWriter().println("</footer>"); 
			 response.getWriter().println("</html>");
	 }
	 else {
		 response.getWriter().println("User not registered. Please register first. ");
	 }
		doGet(request, response);
	}

}
