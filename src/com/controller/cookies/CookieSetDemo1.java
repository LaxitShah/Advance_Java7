package com.controller.cookies;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.PlainDocument;

/**
 * Servlet implementation class CookieSetDemo1
 */ 
public class CookieSetDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Cookie ck=new Cookie("search","who_is_president?");
		ck.setComment("for search history");
		ck.setMaxAge(60*10);
		//ck.setSecure(true);
		response.addCookie(ck);
		System.out.println("cookie set");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
