<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<!DOCTYPE html>
<html>
<style>
            body{
                background: greenyellow;
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
            #pageInfo{
                text-align: right;
                font-size: 30px;
                color: blue;
                 text-layout:fixed;
            }
        </style>

    
   <h1> ALL THE BEST</h1>
           <head>
<title>Redirect after time</title>
<script language="JavaScript" type="text/javascript">
var seconds =300;
var i=60;
function redirect(){
 if (seconds <0){
 // redirect to new url after counter  down.
  window.location = "user_page.jsp";
 }else{
  seconds--;i--;
  if((seconds%60)==0)
  {
      i=59;
  }
  document.getElementById("pageInfo").innerHTML = "Left Timing  0"+String(Math.floor(seconds/60))+":"+String(i);
  setTimeout("redirect()", 1000)
 }
}
</script>
</head>
 

<div id="pageInfo">
<script>
 redirect();
</script>

</div>
        

<body>      

<%
try{
Connection connection = null;
int a=1;
//String eid=request.getParameter("u_id").toString();
ResultSet resultSet = null;
Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/database","oes","oes");
    Statement s=con.createStatement();
   
resultSet = s.executeQuery("select question,option1,option2,option3,option4 from oes.question where exam_id=1");
%><form action="start_exam" method ="post"><%
 int i=1;
 
while(resultSet.next()){
String q=resultSet.getString("question");
String o1=resultSet.getString("option1"); 
String o2=resultSet.getString("option2"); 
String o3=resultSet.getString("option3"); 
String o4=resultSet.getString("option4"); 

%> <%=i%>.<%=q%><br/>

1:<%=o1 %></br> 
2:<%=o2 %></br>
3:<%=o3 %></br>
4:<%=o4 %></br>
<input type="text" name="answ <%=i%>"> </br>

<%
  i++;  }%><input type="hidden" name="nm" value="<%=(i-1)%>">
    <input type="submit" name="submit" value="submit"></form>
</body><% connection.close();
}catch(Exception e)
{
System.out.println(e);
}%>
</html>