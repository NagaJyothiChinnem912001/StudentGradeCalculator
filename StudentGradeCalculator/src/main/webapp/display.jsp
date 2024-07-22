<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Grade</h1>
<h3>Name:</h3>
<%out.println(request.getParameter("name"));%>
<h3>Email:</h3>
<%out.println(request.getParameter("email"));%>
<h3>Result</h3>
<%out.println(request.getAttribute("result"));%>
</body>
</html>