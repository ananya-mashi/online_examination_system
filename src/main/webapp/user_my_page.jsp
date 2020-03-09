<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.exam.bean.UserBean"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<!DOCTYPE html>
<html>
    <head>


 <style>
        body{
                background: skyblue;
            }
            table{
                width:1000px;
                margin: auto;
                text-align: center;
                text-layout:fixed;
                background: black;
            }
            table,tr,th,td{
                padding: 20px;
                color: white;
                border:1px solid #fff;
                border-collapse: collapse;
                font-size:18px;
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
    </head>
    <body>
        <h1><u>USER ACCOUNT</u></h1>
        <table border="1">
            <tr>
                <th>USER ID</th>
                <th>FIRST NAME</th><th>LAST NAME</th>
                <th>PHONE NO.</th>
                <th>GENDER</th>
                <th>ADDRESS</th>
            </tr>

<% 

try{
Connection connection = null;

ResultSet resultSet = null;
Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/database","oes","oes");
    Statement s=con.createStatement();
PreparedStatement ps=con.prepareStatement("select *from OES.EXUSER where user_id='ananya13p' ");
      
       resultSet=ps.executeQuery();
      
    while(resultSet.next()){
%>
  <tr>
                    <td>
                        <%=resultSet.getString("user_id") %>
                    </td>
                    <td>
                        <%=resultSet.getString("fname") %>
                    </td>
                     <td>
                        <%=resultSet.getString("lname") %>
                    </td>
                     <td>
                        <%=resultSet.getString("mobile_nm") %>
                    </td>
                     <td>
                        <%=resultSet.getString("gender") %>
                    </td>
                    <td>
                        <%=resultSet.getString("address") %>
                    </td>
                     </tr>
<%
}%></form>
<%
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</body>
</html>