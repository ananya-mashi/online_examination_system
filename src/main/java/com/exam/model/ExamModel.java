/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.model;

import com.exam.bean.ExamBean;
import com.exam.bean.UserBean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class ExamModel {
    public static ResultSet getExamBean( ExamBean e) throws SQLException
{      ResultSet rs=null;  try {
   
    
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/database","oes","oes");
    Statement s=con.createStatement();
    PreparedStatement ps=con.prepareStatement("select *from OES.EXAM where exam_name=?  ");
    ps.setString(1,e.getExam_name());
    
    rs=ps.executeQuery();
    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExamModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;

}
    
   public int insertExamBean( ExamBean e) throws SQLException, ClassNotFoundException
    {
      
      int status=0;
      
      
		Class.forName("org.apache.derby.jdbc.ClientDriver");
                 Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/database","oes","oes");
                 Statement s=con.createStatement();
                 try
        {  PreparedStatement ps=con.prepareStatement("insert into EXAM values(?,?)");
                
                  ps.setInt(1, e.getExam_id());
                   ps.setString(2,e.getExam_name());
               
              status=ps.executeUpdate();
             
        }catch(SQLException ex)
        {
            System.out.println(ex);

        }
      
        return status;
    }
      
      public static ResultSet updateExamBean( ExamBean e) throws SQLException, ClassNotFoundException
    {
       ResultSet rs=null; 
     
		Class.forName("org.apache.derby.jdbc.ClientDriver");
                 Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/database","oes","oes");
                 Statement s=con.createStatement();
                 try
        {  PreparedStatement ps=con.prepareStatement("update exam set exam_id=?,exam_name=?  where exam_id=?");
                
                  ps.setInt(1, e.getExam_id());
                   ps.setString(2,e.getExam_name());
               
            ps.executeUpdate();
             
        }catch(SQLException ex)
        {
            System.out.println(ex);

        }
      
    return rs;
    
    
    }   
       public static ResultSet deleteExamBean( ExamBean e) throws SQLException
{      ResultSet rs=null;  try {
   
    
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/database","oes","oes");
    Statement s=con.createStatement();
    PreparedStatement ps=con.prepareStatement("delete from OES.EXAM where exam_name=?  ");
    ps.setString(1,e.getExam_name());
    
    rs=ps.executeQuery();
    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExamModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;

}
}