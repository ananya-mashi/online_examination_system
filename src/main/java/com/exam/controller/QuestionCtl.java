
package com.exam.controller;

import com.exam.bean.QuestionBean;
import com.exam.model.QuestionModel;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/questionCtl")
public class QuestionCtl extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    QuestionModel qm=new QuestionModel();
       QuestionBean qb=new QuestionBean();
         String submitType=request.getParameter("submit");
    
  if(submitType.equals("ADD"))
           {
            
        try {
            qb.setExam_id(Integer.parseInt(request.getParameter("e_id")));
          
              qb.setExam_name(request.getParameter("e_name"));
              
            qb.setQuestion(request.getParameter("q"));
            qb.setOption1(request.getParameter("opt1"));
              qb.setOption2(request.getParameter("opt2"));
            qb.setOption3(request.getParameter("opt3"));
            qb.setOption4(request.getParameter("opt4"));
            
            qb.setAnswer(request.getParameter("ans"));
            qb.setCreatedby(request.getParameter("creater"));
            
             
                
            int i=qm.insertQuestionBean(qb);
            if(i!=0)
            {
                //System.out.println("value inserted");
                request.setAttribute("successMessage", "Successfully added...");
                request.getRequestDispatcher("/admin.jsp").forward(request, response);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(QuestionCtl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuestionCtl.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(submitType.equals("save"))
           {out.println("sacccccccccccccccc");
            
        try {qb.setExam_id(Integer.parseInt(request.getParameter("exam_id")));
            qb.setExam_name(request.getParameter("exam_name"));
            qb.setQuestion(request.getParameter("question"));
            qb.setOption1(request.getParameter("option1"));
              qb.setOption2(request.getParameter("option2"));
            qb.setOption3(request.getParameter("option3"));
            qb.setOption4(request.getParameter("option4"));
            
            qb.setAnswer(request.getParameter("answer"));
           
                
            ResultSet i=qm.updateQuestionBean(qb);
            if(i.next())
            {
                //System.out.println("value inserted");
                request.setAttribute("successMessage", "Successfully added...");
                request.getRequestDispatcher("/admin.jsp").forward(request, response);
            }
            } catch (SQLException ex) {
                Logger.getLogger(QuestionCtl.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(QuestionCtl.class.getName()).log(Level.SEVERE, null, ex);
            }
        if(submitType.equals("delete"))
           {out.println("sacccccccccccccccc");
            
        try {
            qb.setQuestion(request.getParameter("questionn"));
           
                
            ResultSet i=qm.deleteQuestionBean(qb);
            if(i.next())
            {
                //System.out.println("value inserted");
                request.setAttribute("successMessage", "Successfully added...");
                request.getRequestDispatcher("/admin.jsp").forward(request, response);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuestionCtl.class.getName()).log(Level.SEVERE, null, ex);
        }
       
            }}}}}

    
