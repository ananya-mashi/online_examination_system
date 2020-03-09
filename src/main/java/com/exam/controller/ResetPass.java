
package com.exam.controller;

import com.exam.bean.AdminBean;
import com.exam.model.AdminModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ResetPass", urlPatterns = {"/ResetPass"})
public class ResetPass extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
                   throws ServletException, IOException {
      String op=  request.getParameter("opass");
          String np=  request.getParameter("npass");
              String rnp=  request.getParameter("rnpass");
              HttpSession session=request.getSession();
              String cpass=(String)session.getAttribute("password");
                  String uname=(String)session.getAttribute("admin_id");
                  String submit=  request.getParameter("submit");
                  if(np.equals(rnp))
                  {
                      request.setAttribute("msg","Password does not match");
                      getServletContext().getRequestDispatcher("change_pass.jsp").forward(request, response);
                  }
                  else if(!cpass.equals(op))
                  {
                      
                      request.setAttribute("msg","Old password is not correct");
                      getServletContext().getRequestDispatcher("change_pass.jsp").forward(request, response);
                  }
                  else
                  {
          try {
              AdminBean a=new AdminBean();
              a.setAdmin_id(uname);
              a.setPassword(np);
              String sql="update admin set password=? where admin_name=?";
              int i=AdminModel.reset(a,sql);
              if(i!=0)
              {
                    
                      request.setAttribute("msg","Password update");
                      getServletContext().getRequestDispatcher("admin.jsp").forward(request, response);
              }
          } catch (SQLException ex) {
              Logger.getLogger(ResetPass.class.getName()).log(Level.SEVERE, null, ex);
          }
                  }
    }
    }
    