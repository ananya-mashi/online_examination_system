
package com.exam.model;

import com.exam.bean.QuestionBean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QuestionModel {
        
    
    
   public int insertQuestionBean( QuestionBean q) throws SQLException, ClassNotFoundException
    {
      
      int status=0;
      
      
		Class.forName("org.apache.derby.jdbc.ClientDriver");
                 Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/database","oes","oes");
                 Statement s=con.createStatement();
                 try
        {  PreparedStatement ps=con.prepareStatement("insert into Question values(?,?,?,?,?,?,?,?,?)");
                
                  ps.setInt(1, q.getExam_id());
                   ps.setString(2,q.getExam_name());
               
                    ps.setString(3,q.getQuestion());
                    ps.setString(4, q.getOption1());
                  ps.setString(5, q.getOption2());
                   ps.setString(6,q.getOption3());
                    ps.setString(7,q.getOption4());
                  ps.setString(8, q.getAnswer());
                   ps.setString(9,q.getCreatedby());
                
              status=ps.executeUpdate();
             
        }catch(SQLException ex)
        {
            System.out.println(ex);

        }
      
        return status;
    }
      
    
      public static ResultSet updateQuestionBean( QuestionBean q) throws SQLException, ClassNotFoundException
    {
       ResultSet rs=null; 
     
		Class.forName("org.apache.derby.jdbc.ClientDriver");
                 Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/database","oes","oes");
                 Statement s=con.createStatement();
                 try
        {  PreparedStatement ps=con.prepareStatement("update question set exam_id=?,exam_name=?,question=?,"
                + "option1=?,option2=?,option3=?,option4=?,answer=?");
                 ps.setInt(1, q.getExam_id());
                   ps.setString(2,q.getExam_name());
                  
                    ps.setString(3,q.getQuestion());
                    ps.setString(4, q.getOption1());
                  ps.setString(5, q.getOption2());
                   ps.setString(6,q.getOption3());
                    ps.setString(7,q.getOption4());
                  ps.setString(8, q.getAnswer());
                
            ps.executeUpdate();
             
        }catch(SQLException ex)
        {
            System.out.println(ex);

        }
      
    return rs;
    
   
    }   
 public static ResultSet deleteQuestionBean( QuestionBean q) throws SQLException
{      ResultSet rs=null;  try {
   
    
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/database","oes","oes");
    Statement s=con.createStatement();
    PreparedStatement ps=con.prepareStatement("delete *from OES.Question where question=?  ");
    ps.setString(1,q.getQuestion());
    
    rs=ps.executeQuery();
    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExamModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;

}
}
                  
