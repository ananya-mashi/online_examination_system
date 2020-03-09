

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="style.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
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
  <section id="main">
      <div class="container">
          <article id="main-col">
              <h1 class="page-title">ABOUT US</h1>
              
       <p>The teacher or course builder creates an account with an exam builder. In such an exam system you can create questions and add them to the exam. You can choose between multiple choice questions or free text questions. The students are provided with a link to the online exam, they sign up and can take the exam. They see the results immediately afterwards.Read more about the objectives of an online examination system and the advantages and disadvantages of an online examination system.</p>
          
          
              <h3>what are typical features?</h3>
              <p>Obviously it must be possible to make an exam. And create questions. Preferably the exam provides for the option to create a question bank. And you have to be able to set the rules when a student passes or fails the exam. Those features are just the basics. Look at our online exam features to get a broader picture.</p>
          </article>           
      </div>
  </section>
  <footer>
    <p>online examination system,COPYRIGHT &copy:2019</p>
</footer>
    </body>
</html>
