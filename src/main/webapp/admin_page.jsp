<%-- 
    Document   : admin_details
    Created on : Jul 8, 2019, 3:23:55 AM
    Author     : sheetal verma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-md bg-dark navbar-dark">
  <a class="navbar-brand" href="#">WELCOME ADMIN</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class ="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="collapsibleNavbar">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" href="admin_page.jsp">HOME</a>
      </li>
     
      
      <li class="nav-item">
        <a class="nav-link" href="admin_my_page.jsp">Admin account</a>
      </li>   
      <li class="nav-item">
        <a class="nav-link" href="add_exam.jsp">Add examination</a>
      </li>   
      <li class="nav-item">
        <a class="nav-link" href="add_question.jsp">Add question</a>
      </li>   
      <li class="nav-item">
        <a class="nav-link" href="questionlist.jsp">QUESTION LIST</a>
      </li>   
    <li class="nav-item">
        <a class="nav-link" href="logoutServlet">LOGOUT</a>
      </li>   
    </ul>
  </div>  
</nav>

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
