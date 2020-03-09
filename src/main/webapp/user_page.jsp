<%-- 
    Document   : user_home_page
    Created on : Jul 8, 2019, 2:48:00 AM
    Author     : sheetal verma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width-device-width">
        <link rel="stylesheet" href="style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <header>
            <div class="container">
                <div id="branding">
                    <h1><span class="highlight">welcome user</span></h1>
                </div>
                <nav>
        <ul>
            <li class="current"><a href="index.jsp">home</a></li>
            <li><a href="user_my_page.jsp">MY ACCOUNT</a></li>
            <li><a href="start_exam.jsp">START EXAM</a></li>
            
            <li><a href="result.jsp">RESULT</a></li>
            <li><a href="logoutServlet">LOGOUT</a></li>
        </ul>
                </nav>
            </div>
        </header>
        <section id="showcase">
    <div class="container">
      
        <h1>QUIZ IN PROGRAMMING LANGUAGES</h1>      
    </div>
</section>
<section id="boxes">
    <div class="container">
        <div class="box">
            
            <h3>C language</h3>
            <p>C is basically a core language......</p>
        </div>
         <div class="box">
              
            <h3>JAVA language</h3>
            <p>JAVA is basically a Platform dependent language......</p>
        </div>
         <div class="box">
              
            <h3>C++ language</h3>
            <p>C++ is basically a object-oriented language......</p>
        </div>
    </div>
</section>
<footer>
    <p>online examination system,COPYRIGHT &copy:2019</p>
</footer>
    </body>
</html>
