package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductList
 */
public class ProductList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static List<String> list2;
	private static int count;
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init method called");
		list2 = new ArrayList<String>();
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(count<2)
		{	
			String[] array =request.getParameterValues("pName");
		
		 
	      for(String text:array) {
	         list2.add(text);
	        
	      }
	   
		
	      response.sendRedirect("Product.html");
	      count++;
		}
		if(count==2)
		{
			
		   System.out.println(list2);
		   PrintWriter out=response.getWriter();
			out.print("<html><body>");
			
			for(String s:list2)
			{
				out.print("<h1>"+s+"</h1>");
			}
			out.print("</body></html>");
		   
		} 
	}
}
