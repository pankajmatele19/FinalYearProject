
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    
        <% 
            int id = Integer.parseInt(request.getParameter("id"));
            java.sql.Date rtd = java.sql.Date.valueOf(request.getParameter("returnd"));
            int day = Integer.parseInt(request.getParameter("day"));
            String fine = request.getParameter("fine");
            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");  
                CallableStatement cs = con.prepareCall("{call LastYearProject.addfine(?,?,?,?)}");
                
                cs.setInt(1, id);
                cs.setDate(2,rtd);
                cs.setInt(3,day);
                cs.setString(4,fine);;
                
                cs.execute();
                
                out.print("<script>");
                out.print("alert('Fine Added Successfully');");
                out.print("location='dispfine.jsp';");
                out.print("</script>");
                
            }
            catch(Exception e) {
                out.println(e.getMessage());
            }
         
        %>
    
</html>
