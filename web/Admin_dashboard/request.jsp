
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    
        <% 
            try{
                String n = (String) session.getAttribute("user");
                if(n!=null) {
                
                int bid = Integer.parseInt(request.getParameter("bid"));
                String name = (String) session.getAttribute("user");
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");  
                CallableStatement cs = con.prepareCall("{call LastYearProject.getreq(?,?)}");
                
                cs.setInt(1, bid);
                cs.setString(2, name);
                
                cs.execute();
                
                out.print("<script>");
                out.print("alert('Book Requested');");
                out.print("location='../Library-website/shop.jsp';");
                out.print("</script>");
                }
                else {
                    out.print("<script>");
                out.print("alert('Login Please');");
                out.print("location='../Library-website/shop.jsp';");
                out.print("</script>");
                    
                }
            }
            catch(Exception e) {
                out.println(e.getMessage());
            }
         
        %>
    
</html>
