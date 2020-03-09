
package com.exam.controller;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
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

@WebServlet(name = "start_exam", urlPatterns = {"/start_exam"})
public class start_exam extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int k=0;
          
             String[] answer=new String[200];
             String[] select_ans=new String[200];
            
               String nm=request.getParameter("nm").toString();
            //
            Connection connection = null;
            ResultSet resultSet = null;
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/database","oes","oes");
            Statement s=con.createStatement();
            resultSet = s.executeQuery("select answer from oes.question where exam_id=1");
            while(resultSet.next()){
           String ans=resultSet.getString("answer").toString();
           out.println(ans);
             answer[++k]=ans;
             }
        
            
           int count=1;
          
            int n=Integer.parseInt(nm);
           out.println(" total "+n);
           String submitType=request.getParameter("submit");
            if(submitType.equals("submit")){
              
            for(int j=1;j<=n;j++){
                 select_ans[j]=request.getParameter("answ "+j).toString();
                 out.println(select_ans[j]);
            }
            for(int z=1;z<=n;z++){
                    if(select_ans[z].equals(answer[z]))
                    {
                       ++count;
                      
                    }
                }
            
            if (count>=5)
            {
               request.setAttribute("Msg", "You are pass."
                       + "Total obtain marks "+count);
                request.getRequestDispatcher("/your_result.jsp").forward(request, response);
            }
            else{request.setAttribute("Msg", "You are fail.Total obtain marks"+count);
                request.getRequestDispatcher("/your_result.jsp").forward(request, response);
               // out.println("fail c="+count);
            }}
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(start_exam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(start_exam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
