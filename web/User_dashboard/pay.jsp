
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    
        <% 
            int fid = Integer.parseInt(request.getParameter("fid"));
            int amount = Integer.parseInt(request.getParameter("amt"));
            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");  
                CallableStatement cs = con.prepareCall("{call LastYearProject.addpay(?,?)}");
                
                cs.setInt(1, fid);
                cs.setInt(2, amount);
                
                cs.execute();
                
                out.print("<script>");
                out.print("alert('Fine Paid Successfully');");
                out.print("location='disppay.jsp';");
                out.print("</script>");
                
            }
            catch(Exception e) {
                out.println(e.getMessage());
            }
         
        %>
    
</html>
