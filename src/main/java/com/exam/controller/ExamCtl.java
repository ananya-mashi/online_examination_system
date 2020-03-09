
package com.exam.controller;
import com.exam.model.*;
import com.exam.bean.ExamBean;
import java.io.IOException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


  @WebServlet("/examCtl")
  public class ExamCtl extends HttpServlet 
{

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       ExamModel em=new ExamModel();
       ExamBean eb=new ExamBean();
          String exam_name=request.getParameter("exam_name");
          
           String submitType=request.getParameter("submit");
           if(submitType.equals("submit")){
        try {
            eb.setExam_name(exam_name);
            ResultSet rs=em.getExamBean(eb);
            try {
                if(rs.next())
                {
                    getServletContext().getRequestDispatcher("/start_exam.jsp").forward(request,response);
                }
                else{
                    request.setAttribute("message", "no such type of exam!!!!!!!");
                    request.getRequestDispatcher("/exam.jsp").forward(request, response);
                }
            } catch (SQLException ex) {
                Logger.getLogger(userRegistration.class.getName()).log(Level.SEVERE, null, ex);
            }} catch (SQLException ex) {
            Logger.getLogger(ExamCtl.class.getName()).log(Level.SEVERE, null, ex);
        }}
           
       
           else if(submitType.equals("ADD"))
           {
            
           try {
             
               eb.setExam_id(Integer.parseInt(request.getParameter("e_id")));
               eb.setExam_name(request.getParameter("e_name"));
              
               int i=em.insertExamBean(eb);
               if(i!=0)
               {
                   //System.out.println("value inserted");
                   request.setAttribute("successMessage", "Successfully added...");
                   request.getRequestDispatcher("/add_question.jsp").forward(request, response);
               }
               
           } catch (SQLException ex) {
               Logger.getLogger(ExamCtl.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(ExamCtl.class.getName()).log(Level.SEVERE, null, ex);
           }
       
            }}}

