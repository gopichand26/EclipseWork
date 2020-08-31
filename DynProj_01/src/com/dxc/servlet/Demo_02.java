package com.dxc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo_02
 */
public class Demo_02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo_02() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Obtaining request parameter's values
		String na = request.getParameter("name");
		String em = request.getParameter("email");
		String mo = request.getParameter("mobile");
		
		//printing those request parameter values to the browser - Response
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Inside of doPost()</h2>");
		out.println("Name : "+na+"<br>");
		out.println("Email : "+em+"<br>");
		out.println("Mobile : "+mo+"<br>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
