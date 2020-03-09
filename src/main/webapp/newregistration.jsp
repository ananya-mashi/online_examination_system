
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="lightgrey">
        <div class="loginbox1">
        <h1>NEW USER REGISTRATION</h1>
    
        <form action="userRegistration" method="post">
          
               <p> Enter First name:<input type= "text" name="fname" placeholder="firstname"required=" This Field is required">
                    <p>last name:</p><input type="text" name="lname" placeholder="lastname">
                 <p>enter email:</p><input type="email" name="user_id" placeholder="email address"required=" This Field is required">
                 <p>enter phone_no:</p><input type="integer" name="mobnm" placeholder="mobile number">
                 <p>enter gender:</p><input type="text" name="gender" placeholder="male or female" required=" This Field is required">
                <p>enter address:</p><input type="text" name="address" placeholder="address" required=" This Field is required">
              <p>enter password:</p><input type="password" name="password" placeholder="password"required=" This Field is required" minlength="8">
 <p>enter confirm password:</p><input type="password" name="confirm_pass" placeholder="confirm_pass" required=" This Field is required" minlength="8">
      <p> Registration_date</p>:<input type="text" name="reg_date" placeholder="Registration_date" required=" This Field is required">
             <input type="submit" name ="submit" value="register" >                  
            </div>
        </form>
    </body>
</html>

	
</form>
    </body>
</html>
