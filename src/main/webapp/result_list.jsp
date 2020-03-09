
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("userid");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:1527/";
String database = "database";
String userid = "oes";
String password = "oes";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<body>

<h1>Retrieve data from database in jsp</h1>
<table border="1">
<tr>
    <td>exam_id</td>
<td>exam name</td>
<td>question</td>
<td>option1</td>
<td>option2</td>
<td>option3</td>
<td>option4</td>
<td>answer</td>
</tr>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select exam_id,exam_name,question,option1,option2,option3,option4 from oes.question";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("exam_name") %></td>
<td><%=resultSet.getString("question") %></td>
<td><%=resultSet.getString("option1") %></td>
<td><%=resultSet.getString("option2") %></td>
<td><%=resultSet.getString("option3") %></td>
<td><%=resultSet.getString("option4") %></td>
</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</body>
</html>