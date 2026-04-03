<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.time.LocalDateTime" %>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>

<%
    /* String name = (String) request.getAttribute("name"); 
    Integer rno = (Integer) request.getAttribute("rno");
    LocalDateTime ld = (LocalDateTime) request.getAttribute("time");*/
%>

<h1>
	<%-- Name = <%= name %> --%>
	     Name= ${name}
	
</h1>
<h1>
	<%-- Roll No = <%= rno %> --%>
		Roll No = ${rno}
</h1>

<h1>Date and Time = 
   <%--  <%= (ld != null) ? ld.toString() : "No time available" %> --%>
   ${time}
</h1>
<hr>
<h1>
		Marks=${marks}
</h1>

<hr>
		<c:forEach var="item" items="${marks}">
			<h1>${item}</h1>
		
		</c:forEach>
</body>
</html>