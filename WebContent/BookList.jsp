<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Book Name</th>
			<th>Book Price</th>
			<th>Book QTY</th>
			<th>ACTION</th>	
		</tr>
 		<% 
 		List<BookBean> booksList = (List<BookBean>) request.getAttribute("bookList");

 			for(int i=0;i<booksList.size();i++)
 			{
 				BookBean bean=booksList.get(i);
 			
 			%>
 			<tr>
			<td><%=bean.getbName()%></td>
			<td><%=bean.getbPrice()%></td>
			<td><%=bean.getbQty()%></td>
		</tr>
			<%
				}
			%>
	


	
 
	</table>

</body>
</html>