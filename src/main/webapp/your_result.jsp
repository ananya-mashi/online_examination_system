<%-- 
    Document   : your_result
    Created on : 16 Jul, 2019, 9:29:25 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                background: greenyellow;
            }
            #showcase h1{
                text-align: center;
               
               color:black;
               font-size: 50px;
               font-family:sans-serif;
               
            }
           .bk{
    border: none;
    outline: none;
    height: 40px;
    background: #fb2525;
    color:#fff;
    align: center;
    font-size:25px;
    border-radius: 40px;
}
.bk :hover{
    cursor: pointer;
    background:#ffc107;
    color: #000;
}
        </style>
    </head>
    <body>
        <div id="showcase">
        <h1>${Msg}</h1>
        </div>
        <td><a class="bk" href="user_page.jsp">BACK</a></td>
    </body>
</html>
