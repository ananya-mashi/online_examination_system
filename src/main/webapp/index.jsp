<%-- 
    Document   : index
    Created on : Jul 8, 2019, 12:53:30 AM
    Author     : sheetal verma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>home</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="style.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-md bg-dark navbar-dark">
  <a class="navbar-brand" href="#">QUIZ</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class ="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="collapsibleNavbar">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" href="index.jsp">HOME</a>
      </li>
      <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">LOGIN
          </a>
          <div class="dropdown-menu">
              <a class="dropdown-item" href="user.jsp">USER LOGIN</a>
               <a class="dropdown-item" href="admin.jsp">ADMIN LOGIN</a>
               <a class="dropdown-item" href="newregistration.jsp">NEW USER REGISTRATION</a>
          </div>
      </li>
      
      <li class="nav-item">
        <a class="nav-link" href="about_us.jsp">ABOUT US</a>
      </li>   
      <li class="nav-item">
        <a class="nav-link" href="contact_us.jsp">CONTACT US</a>
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


