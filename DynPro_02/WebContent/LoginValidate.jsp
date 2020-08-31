<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
if(request.getMethod().equalsIgnoreCase("post")){

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>validation</title>
</head>
<body>
	<%
	   String username = request.getParameter("username");
	   String password = request.getParameter("password");
	   if(validate(username, password)){
		   response.sendRedirect("Success.jsp");
	   }
	   else{
		   response.sendRedirect("Login.jsp");
	   }
	%>
	
	<%!
	
	public boolean validate(String un, String pw){
		if(un.equals("Kishor") && pw.equals("Kumar")){
			return true;
		}
		else{
			return false;
		}
	}
	
	%>
</body>
</html>
<%}
else{
	response.sendRedirect("Login.jsp");
}%>