package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductController
 */
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String productName=request.getParameter("pName");
		int productPrice=Integer.parseInt(request.getParameter("pPrice"));
		int productQua=Integer.parseInt(request.getParameter("pQua"));
		
		String[] arrlist =request.getParameterValues("pCat");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		out.print("<h1>"+productName+"</h1>");
		out.print("<h1>"+productPrice+"</h1>");		
		out.print("<h1>"+productQua+"</h1>");	
		out.print("<h1> total: "+productPrice*productQua+"</h1>");
		
		for(String s:arrlist)
		{
			out.print("<h1>"+s+"</h1>");
		}
		out.print("</body></html>");
		
		
	}

}
