<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>

<%
    String name = (String) request.getAttribute("name");
    Integer id = (Integer) request.getAttribute("id");
    List<String> friends = (List<String>) request.getAttribute("f");
%>

<h1>Name=<span style="color:red;"><%= name %></span></h1>

<h1>Id = <%= id %></h1>

<h2>Friends List:</h2>
<ul>
<%
    if(friends != null){
        for(String s : friends){
%>
            <li style="color:red;"><%= s %></li>
<%
        }
    } else {
%>
        <li>No friends found</li>
<%
    }
%>
</ul>

</body>
</html>