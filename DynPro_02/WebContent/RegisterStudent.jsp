<%@page import="com.dxc.beans.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>registration</title>
</head>
<body>
	<jsp:useBean id="student" class="com.dxc.beans.Student" scope="request"/>
	Student registred in the earlier page : <%= student %>
</body>
</html>