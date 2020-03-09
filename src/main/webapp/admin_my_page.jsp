<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.exam.bean.UserBean"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<!DOCTYPE html>
<html><head>
    <style>
            body{
                background: skyblue;
            }
            table{
                width:1000px;
                margin: auto;
                text-align: center;
                table-layout:fixed;
                background: black;
            }
            table,tr,th,td{
                padding: 20px;
                color: white;
                border:1px solid #fff;
                border-collapse: collapse;
                font-size:30px;
                font-family: Arial;
                background:linear-gradient(top,#3c3c3c 0%,#222222 100%);
                background:-webkit-linear-gradient(top,#3c3c3c 0%,#222222 100%);
            }
            td:hover{
                background: orangered;
            }
            h1{
                text-align: center;
            } 
        </style>
        <title>JSP Page</title>
    </head>
    <body>
        <h1><u>ADMIN ACCOUNT</u></h1>
        <table border="1">
            <tr>
                <th>ADMIN ID</th>
                <th>ADMIN NAME</th>
            </tr>
    


<% 

try{
Connection connection = null;

ResultSet resultSet = null;
Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/database","oes","oes");
    Statement s=con.createStatement();
PreparedStatement ps=con.prepareStatement("select *from OES.ADMIN where admin_id='ananya123' ");
      
       resultSet=ps.executeQuery();
      
    while(resultSet.next()){
%>
 <tr>
                    <td>
                        <%=resultSet.getString("admin_id") %>
                    </td>
                    <td>
                        <%=resultSet.getString("admin_name") %>
                    </td>
                     </tr>
<%
}%>
   </form>
<%
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</body>
</html>