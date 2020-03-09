
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="lightgrey">
         <div class="loginbox">
             <h1><u>ADMIN LOGIN HERE</u></h1>
       <form action="loginCtl" method="post">
            <p>enter admin name:</p>
            <input type="text" name="a_id" placeholder="username">

            <p>enter password:</p>
            <input type="password" name="pass" placeholder="password">

                <input type="submit" name="submit" value="login">
         
        </form>
         </div> 
    </body>
</html>
