<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<!DOCTYPE html>
<html>
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
        <h1><u>QUESTIONS LIST</u></h1>
        <table border="1">
            <tr>
                <th>EXAM ID</th>
                <th>EXAM NAME</th>
                <th>QUESTION NAME</th>
                <th>OPTION1</th>
                <th>OPTION2</th>
                <th>OPTION3</th>
                <th>OPTION4</th>
                <th>CORRECT ANSWER</th>
            </tr>
<%
try{
Connection connection = null;

ResultSet resultSet = null;
Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/database","oes","oes");
    Statement s=con.createStatement();
resultSet = s.executeQuery("select * from oes.question");
while(resultSet.next()){
%>
<tr ><form action="questionCtl" method="post">
<td><%=resultSet.getInt("exam_id") %></td>
<td><%=resultSet.getString("exam_name") %></td>

<td><%=resultSet.getString("question") %></td>
<td><%=resultSet.getString("option1") %></td>
<td><%=resultSet.getString("option2") %></td>
<td><%=resultSet.getString("option3") %></td>
<td><%=resultSet.getString("option4") %></td>
<td><%=resultSet.getString("answer") %></td>


<%
}%></form>
<%connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</body>
</html>