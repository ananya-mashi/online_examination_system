<%-- 
    Document   : exam
    Created on : 8 Jul, 2019, 2:03:03 PM
    Author     : HP
--%>

<%@page import="com.exam.bean.ExamBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>exam Page</title>
    </head>
    <body>
        <h1>START EXAM </h1>
        <form action="examCtl" action="start_exam.jsp" action="resultListCtl" method="post">
            
             <tr>
                <td><h3 style="color:red;">${message}</h3>
                    <h3 style="color:greenyellow;">${successMessage}</h3>
                </td></tr>
             Exam name:<input type="text" name="exam_name">
             Exam id:<input type="text" name="e_id">
           
            <input type="submit" value="submit" name="submit"></form>
  
    </body>
</html>
