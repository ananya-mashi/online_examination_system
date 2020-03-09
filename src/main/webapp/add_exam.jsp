<%-- 
    Document   : add_examination
    Created on : Jul 8, 2019, 2:42:41 AM
    Author     : sheetal verma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                table-layout:fixed;
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
         .bk,input[type="submit"]{
    border: none;
    outline: none;
    height: 40px;
    background: #fb2525;
    color:#fff;
    font-size:30px;
    border-radius: 45px;
}
.bk,input[type="submit"]:hover{
    cursor: pointer;
    background:#ffc107;
    color: #000;
}
    </style>
    </head>
    <body>
        <h1><u>ADD EXAM</u></h1>
        <br><br>
        ${msg}
        <br>
        <form action="examCtl" method="post">
            <table align="center">
                <tr><th>ENTER EXAM ID:</th><td><input type="text" name="e_id"></td></tr>

                <tr><th>ENTER EXAM NAME:</th><td><input type="text" name="e_name"></td></tr>

                <tr><td><input type="submit" name="submit" value="ADD"></td>
                <td><a class="bk" href="admin_page.jsp">BACK</a></td>
                </tr>
            </table>
        </form>
    </body>
</html>
