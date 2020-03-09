<%-- 
    Document   : change_pass
    Created on : 12 Jul, 2019, 1:59:18 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Password change</title>
    </head>
    <body>
        <form action="ResetPass" method="post">
           Login_id:<input type="text" name="l_id" required=" This Field is required"><br>
	Old-Password:<input type="password" name="opass" required=" This Field is required"><br>
        New-Password:<input type="password" name="npass" required=" This Field is required"><br>
        Retype new Password:<input type="password" name="rnpass" required=" This Field is required"><br>
	<input type="submit" name="submit" value="Reset">
       
        </form>
    </body>
</html>
