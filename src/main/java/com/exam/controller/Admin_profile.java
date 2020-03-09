/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.controller;

import com.exam.bean.AdminBean;
import com.exam.model.AdminModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
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
@WebServlet(name = "Admin_profile", urlPatterns = {"/Admin_profile"})
public class Admin_profile extends HttpServlet {

    
        
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       AdminModel am=new AdminModel();
       AdminBean ab=new AdminBean();
          String admin_id=request.getParameter("admin_id");
          String admin_name=request.getParameter("admin_name");
           String password=request.getParameter("pass");
              String confirm_pass=request.getParameter("confirm_pass");
           String submitType=request.getParameter("submit");
           if(submitType.equals("save")){
        try {
            ab.setAdmin_id(admin_id);
            ab.setAdmin_name(admin_name);
            ab.setPassword(password);
            ab.setConfirm_pass(confirm_pass);
            ResultSet rs=am.updateAdminBean(ab);
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
            }} catch (SQLException ex) {
            Logger.getLogger(Admin_profile.class.getName()).log(Level.SEVERE, null, ex);
        }  catch (ClassNotFoundException ex) {
               Logger.getLogger(Admin_profile.class.getName()).log(Level.SEVERE, null, ex);
           }}
       
    }
}