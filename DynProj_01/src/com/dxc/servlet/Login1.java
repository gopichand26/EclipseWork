package com.dxc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginExercise
 */
public class Login1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>login</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form method=\"post\">");
		out.println("User name : <input type =\"text\" name=\"username\"><br>");
		out.println("Password: <input type=\"password\" name=\"password\"><br>");
		out.println("<input type=\"submit\" value=\"Login\">");
		out.println("<input type=\"reset\" value=\"Cancel\">");
		out.println("</form>");

		out.println("</body>");
		out.println("</html>");

		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String un = request.getParameter("username");
		String pw = request.getParameter("password");
		if(Validate(un, pw)){
			HttpSession session = request.getSession(true);
			session.setAttribute("username", un);
			RequestDispatcher rd = request.getRequestDispatcher("Success");
			rd.forward(request, response);
			//response.sendRedirect("sucess");
		}
		else {
			showLoginForm(response, true);
			//out.println("Login failed");
		}
		
	}

	private void showLoginForm(HttpServletResponse response, boolean error) throws IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>login</title>");
		out.println("</head>");
		out.println("<body>");
		if(error) {
			out.println("<h2>Invalid username or password or both>/h2>"); 
		}
		
		out.println("<form method=\"post\">");
		out.println("User name : <input type =\"text\" name=\"username\"><br>");
		out.println("Password: <input type=\"password\" name=\"password\"><br>");
		out.println("<input type=\"submit\" value=\"Login\">");
		out.println("<input type=\"reset\" value=\"Cancel\">");
		out.println("</form>");

		out.println("</body>");
		out.println("</html>");

		out.close();
		
	}

	private boolean Validate(String un, String pw) {
		// TODO Auto-generated method stub
		if(un.equals("gopi")&& pw.equals("chand")) {
			return true;
		}
		else {
		return false;
		}
	}

}
