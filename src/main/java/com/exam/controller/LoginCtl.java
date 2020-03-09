package com.exam.controller;

import com.exam.bean.AdminBean;

import com.exam.model.AdminModel;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/loginCtl")
  public class LoginCtl extends HttpServlet 
{

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       AdminModel am=new AdminModel();
       AdminBean ab=new AdminBean();
          String admin_id=request.getParameter("a_id");
           String password=request.getParameter("pass");
           String submitType=request.getParameter("submit");
           if(submitType.equals("login")){
           ab.setAdmin_id(admin_id);
           ab.setPassword(password);
           
           ResultSet rs=am.getAdminBean(ab);
        try {
            if(rs.next())
            {
                getServletContext().getRequestDispatcher("/admin_page.jsp").forward(request,response);
            }
            else{
                request.setAttribute("message", "DATA NOT FOUND ,CLICK ON REGISTER!!!!!!!!!!");
                request.getRequestDispatcher("/admin.jsp").forward(request, response);
                        }
        } catch (SQLException ex) {
            Logger.getLogger(userRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }}
       
            if(submitType.equals("submit"))
           {
            
            
                 
           try {
               ab.setAdmin_name(request.getParameter("a_name"));
               
               ab.setAdmin_id(request.getParameter("a_id"));
               ab.setPassword(request.getParameter("pass"));
               ab.setConfirm_pass(request.getParameter("confirm_pass"));
               
               int i=am.insertAdminBean(ab);
               if(i!=0)
               {
                  // System.out.println("value inserted");
                   request.setAttribute("successMessage", "Registration done,plese login to continue...");
                   request.getRequestDispatcher("/admin.jsp").forward(request, response);
               }
              
           } catch (SQLException ex) {
               Logger.getLogger(LoginCtl.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(LoginCtl.class.getName()).log(Level.SEVERE, null, ex);
           }
             
            } 
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
}}