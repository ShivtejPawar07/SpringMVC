<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.time.LocalDateTime" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>

<%
    String name = (String) request.getAttribute("name");
    Integer rno = (Integer) request.getAttribute("rno");
    LocalDateTime ld = (LocalDateTime) request.getAttribute("time");
%>

<h1>Name = <%= name %></h1>
<h1>Roll No = <%= rno %></h1>

<h1>Date and Time = 
    <%= (ld != null) ? ld.toString() : "No time available" %>
</h1>

</body>
</html>