<%-- 
    Document   : login
    Created on : Jul 8, 2019, 1:08:50 AM
    Author     : sheetal verma
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="style.css">
  
        <title>JSP Page</title>
    </head>
    <body bgcolor="lightgrey">
        <div class="loginbox">
            <h1><u>LOGIN HERE</u></h1>
            <form action="userRegistration" method="post">
                <p> enter username:</p>
                <input type="text" name="u_id" id="user_id" placeholder="username" required="required field">
                <p>enter password:</p>
                <input type="password" name="pass" id="password" placeholder="password"  required="required field"><br>
                <input type="submit" name="submit" value="login"><br>
               <a href="newregistration.jsp">NEW USER REGISTER HERE</a>
        </form>
            </div>
      
       
    </body>
</html>
