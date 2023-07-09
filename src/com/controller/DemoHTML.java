package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoHTML
 */
public class DemoHTML extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */


	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				
		//response.setContentType("text/plain");
		response.setContentType("text/html");
		
		String name="world";
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		out.print("<h1>hello "+name+"</h1>");
		out.print("</body></html>");
		
		//out.print("hello world");
		 out.close();
	}

}
