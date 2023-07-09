package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bean.BookBean;
/**
 * Servlet implementation class BookController
 */
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static ArrayList<BookBean> bookList=new ArrayList<BookBean>();
	
	public static ArrayList<BookBean> getList()
	{
		return bookList;
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
			
		String bName=request.getParameter("txtBookName");
		String price=request.getParameter("txtBookPrice");
		
		int bPrice=0;
		
		if(!price.equals("") && price!=null)
		{
			bPrice=Integer.parseInt(price);
		}
		String qty=request.getParameter("txtBookQty");
		int bQty=0;
		
		if(!qty.equals("") && qty!=null)
		{
			bQty=Integer.parseInt(qty);
		}
			
		BookBean bookBean=new BookBean();
		
		bookBean.setbName(bName);
		bookBean.setbPrice(bPrice);
		bookBean.setbQty(bQty);
		
		bookList.add(bookBean);
		
		
		request.setAttribute("bookList", bookList);
		request.getRequestDispatcher("BookList.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
