<%-- 
    Document   : logout
    Created on : 23 Aug, 2022, 5:47:13 PM
    Author     : Pankaj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        if (session.getAttribute("user") != null) {
            session.removeAttribute("user");
            response.sendRedirect("../Library-website/login.html");
        } else {
            response.sendRedirect("../Library-website/login.html");
        }
        %>
    </body>
</html>
