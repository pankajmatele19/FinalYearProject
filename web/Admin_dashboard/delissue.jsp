
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="javax.servlet.http.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    
        <% 
            
            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
                int isd = Integer.parseInt(request.getParameter("isid"));
                CallableStatement cs = con.prepareCall("{call LastYearProject.delissue(?)}");
                
                cs.setInt("isid", isd);
                
                cs.execute();
                
                out.print("<script>");
                out.print("alert('Issue Deleted Successfully');");
                out.print("location='dispissue.jsp';");
                out.print("</script>");
            }
            catch(Exception e) {
                out.println(e.getMessage());
            }
         
        %>
    
</html>
