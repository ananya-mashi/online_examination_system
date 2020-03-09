

<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<% int count=0;
    String user_id=request.getParameter("user_id");
      String password=request.getParameter("password");
    Connection connection=null;
Class.forName("org.apache.derby.jdbc.ClientDriver");
   Statement statement=null;
   ResultSet resultSet=null;
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        <h1><u>RESULT</u></h1>
        <table border="1">
            <tr>
                <th>USER ID</th>
                <th>FIRST NAME</th><th>LAST NAME</th>
                <th>PHONE NO.</th>
                <th>GENDER</th>
                <th>ADDRESS</th>
                <th>EXAM ID</th>
                <th>EXAM NAME</th>
                <th>RESULT</th>
            </tr>
             <tr>
                <td>ananya13p@gmail.com</td>
                <td>ananya</td><td>mashiwal</td>
                <td>9027402499</td>
                <td>female</td>
                <td>haridwar</td>
                <td>1</td>
                <td>JAVA</td>
                <td>75%</td>
            </tr>