/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.model;

import com.exam.bean.ExamBean;
import com.exam.bean.UserBean;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP
 */

public class UserModel {
    
    
     public int insertUserBean( UserBean u) throws SQLException, ClassNotFoundException
    {
      
      int status=0;
      
      
		Class.forName("org.apache.derby.jdbc.ClientDriver");
                 Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/database","oes","oes");
                 Statement s=con.createStatement();
                 try
        {  PreparedStatement ps=con.prepareStatement("insert into EXUSER values(?,?,?,?,?,?,?,?,?)");
                  ps.setString(1,u.getFname());
                  ps.setString(2, u.getLname());
                   ps.setString(3,u.getUser_id());
                  ps.setString(4, u.getPassword());
                   ps.setString(5,u.getConfirm_pass());
                  
                  ps.setString(6, u.getAddress());
                   ps.setString(7,u.getGender());
                    ps.setString(8, u.getRegistration_date());
                
                 ps.setInt(9, u.getMobnm());
                
              status=ps.executeUpdate();
             
        }catch(Exception e)
        {
            System.out.println(e);

        }
      
        return status;
    }
    

 
public static ResultSet getUserBean( UserBean u)
{ResultSet rs=null;
    UserBean ub=new UserBean();
try{Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/database","oes","oes");
     Statement s=con.createStatement();
      PreparedStatement ps=con.prepareStatement("select *from OES.EXUSER where user_id=? and password=? ");
        ps.setString(1,u.getUser_id());
        ps.setString(2, u.getPassword());
       rs=ps.executeQuery();
      
}catch(Exception e)
{
    System.out.println(e);
}
return rs;
}


      public static ResultSet updateUserBean( UserBean u) throws SQLException, ClassNotFoundException
    {
       ResultSet rs=null; 
     
		Class.forName("org.apache.derby.jdbc.ClientDriver");
                 Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/database","oes","oes");
                 Statement s=con.createStatement();
                 try
        {  PreparedStatement ps=con.prepareStatement("update exam set fname=?,lname=?,user_id=?,password=?,confirm_pass=?"
                + "address=?,gender=?,registration_date=?,mobnm=? where user_id=?");
                   ps.setString(1,u.getFname());
                  ps.setString(2, u.getLname());
                   ps.setString(3,u.getUser_id());
                  ps.setString(4, u.getPassword());
                   ps.setString(5,u.getConfirm_pass());
                  
                  ps.setString(6, u.getAddress());
                   ps.setString(7,u.getGender());
                    ps.setString(8, u.getRegistration_date());
                
                 ps.setInt(9, u.getMobnm());
            ps.executeUpdate();
             
        }catch(SQLException ex)
        {
            System.out.println(ex);

        }
      
    return rs;
    }
public static ResultSet deleteUserBean( UserBean u)
{ResultSet rs=null;
    UserBean ub=new UserBean();
try{Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/database","oes","oes");
     Statement s=con.createStatement();
      PreparedStatement ps=con.prepareStatement("delete from OES.EXUSER where user_id=? ");
        ps.setString(1,u.getUser_id());
    
       rs=ps.executeQuery();
      
}catch(Exception e)
{
    System.out.println(e);
}
return rs;
}}