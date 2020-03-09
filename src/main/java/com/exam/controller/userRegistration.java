package com.exam.controller;

import com.exam.bean.UserBean;
import com.exam.model.UserModel;
import static java.awt.SystemColor.window;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;

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
@WebServlet("/userRegistration")
  public class userRegistration extends HttpServlet 
{

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       UserModel um=new UserModel();
       UserBean ub=new UserBean();
          String user_id=request.getParameter("u_id");
         
           String password=request.getParameter("pass");
           String submitType=request.getParameter("submit");
           if(submitType.equals("login")){
           ub.setUser_id(user_id);
           ub.setPassword(password);
           
           ResultSet rs=um.getUserBean(ub);
        try {
            if(rs.next())
            {
                getServletContext().getRequestDispatcher("/user_page.jsp").forward(request,response);
            }
            else
        {
        request.setAttribute("message", "DATA NOT FOUND ,CLICK ON REGISTER!!!!!!!!!!");
        request.getRequestDispatcher("/user.jsp").forward(request, response);
        }
        } catch (SQLException ex) {
            Logger.getLogger(userRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }}
       
            if(submitType.equals("register"))
           {
            
            try {
                 
                     ub.setFname(request.getParameter("fname"));
                     ub.setLname(request.getParameter("lname"));
                       ub.setUser_id(request.getParameter("user_id"));
                       ub.setPassword(request.getParameter("password"));
                     ub.setConfirm_pass(request.getParameter("confirm_pass"));
                     ub.setMobnm(Integer.parseInt(request.getParameter("mobnm")));
                    ub.setRegistration_date(request.getParameter("reg_date"));
                     ub.setAddress(request.getParameter("address"));
                     ub.setGender(request.getParameter("gender"));
                      
                    int i=um.insertUserBean(ub);
                    if(i!=0)
                    {
                        //System.out.println("value inserted");
                        request.setAttribute("successMessage", "Registration done,plese login to continue...");
                request.getRequestDispatcher("/user.jsp").forward(request, response);
                    }
                                  
            } catch (SQLException ex) {
                Logger.getLogger(userRegistration.class.getName()).log(Level.SEVERE, null, ex);
            }catch (ClassNotFoundException ex) {
                Logger.getLogger(userRegistration.class.getName()).log(Level.SEVERE, null, ex);
            } 
       
        }
}}