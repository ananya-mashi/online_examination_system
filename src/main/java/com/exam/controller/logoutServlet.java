package com.exam.controller;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/logoutServlet")
public class logoutServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/jsp");
        try (PrintWriter out = response.getWriter()) {
            request.getRequestDispatcher("index.jsp").include(request,response);
            HttpSession session=request.getSession();
            session.invalidate();
            out.print("you are successfully logged out");
        }
    }
}
