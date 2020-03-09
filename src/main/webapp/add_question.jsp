

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
    font-size:25px;
    border-radius: 40px;
}
.bk,input[type="submit"]:hover{
    cursor: pointer;
    background:#ffc107;
    color: #000;
}
    </style>
    </head>
    <body>
        <h1>ADD QUESTIONS</h1>
        <form action="questionCtl" method="post">
            <table align="center">
                <tr><td>ENTER EXAM ID:</td><td><input type="text" name="e_id"></td></tr>

                <tr><td>ENTER EXAM NAME:</td><td><input type="text" name="e_name"></td></tr>
                 <tr><td>ENTER QUESTION NAME:</td><td><input type="text" name="q"></td></tr>
 <tr><td>ENTER OPTION 1ST:</td><td><input type="text" name="opt1"></td></tr>
  <tr><td>ENTER OPTION 2ND:</td><td><input type="text" name="opt2"></td></tr>
   <tr><td>ENTER OPTION 3RD:</td><td><input type="text" name="opt3"></td></tr>
    <tr><td>ENTER OPTION 4TH:</td><td><input type="text" name="opt4"></td></tr>
    <tr><td>ENTER CORRECT OPTION:</td><td><input type="text" name="ans"></td></tr>
    <tr><td>Created-By:<td></td><input type="text" name="creater"><br></td></tr>
                <tr><td><input type="submit" name="submit" value="ADD"></td>
                    <td><a class="bk" href="admin_page.jsp">BACK</a></td>
                </tr>
            </table>
        </form>
    </body>
</html>
