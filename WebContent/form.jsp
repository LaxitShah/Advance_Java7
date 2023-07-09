<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
		String name=(String)request.getAttribute("name");
	
		if(name!=null)
		{
			out.println(name);
		}
		else
		{
			out.println("");
		}
	%>
	<form action="formcontroller">
		<input type="text" name="name" placeholder="enter name">
		<br>
		<input type="submit" value="submit">
	</form>
	
	
</body>
</html>