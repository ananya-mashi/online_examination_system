
package com.exam.controller;

import com.exam.bean.ResultBean;
import com.exam.model.ResultModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
@WebServlet("/resultListCtl")
public class ResultListCtl extends HttpServlet {

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { {
                
     
         String uid=request.getParameter("u_id");
          int e_id=Integer.parseInt(request.getParameter("e_id"));
           String exam_name=request.getParameter("exam_name");
         String submitType=request.getParameter("submit");
        try { 
        ResultBean rb=new ResultBean();
    
        ResultModel rm=new ResultModel();
         
Connection connection = null;

ResultSet resultSet = null;
Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/database","oes","oes");
    Statement s=con.createStatement();
   
          
   
           if(submitType.equals("submit")){
                rb.setUser_id(uid);
           rb.setExam_id(e_id);
         rb.setExam_name(exam_name);
         rb.setUser_id(uid);
         ResultSet rs=rm.getExamBean(rb);
     
        
           }   
           
    }           catch (SQLException ex) {
                    Logger.getLogger(ResultListCtl.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ResultListCtl.class.getName()).log(Level.SEVERE, null, ex);
                }
}             
            }}