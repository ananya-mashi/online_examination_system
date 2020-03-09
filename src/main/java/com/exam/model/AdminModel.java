/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.model;

import com.exam.bean.AdminBean;

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

public class AdminModel {

    public static int reset(AdminBean a, String sql) throws SQLException { int i=0; 
        try {
        
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/database","oes","oes");
            Statement s=con.createStatement();
            PreparedStatement ps=con.prepareStatement("sql");
            ps.setString(1,a.getPassword ());
                 ps.setString(2,a.getAdmin_id());
                 i=ps.executeUpdate();
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    return i;}
    
    
    
     public int insertAdminBean( AdminBean a) throws SQLException, ClassNotFoundException
    {
      
      int status=0;
      
      
		Class.forName("org.apache.derby.jdbc.ClientDriver");
                 Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/database","oes","oes");
                 Statement s=con.createStatement();
                 try
        {  PreparedStatement ps=con.prepareStatement("insert into ADMIN values(?,?,?,?)");
                 
                  ps.setString(1, a.getAdmin_name());
                   ps.setString(2,a.getAdmin_id());
                  ps.setString(3, a.getPassword());
                   ps.setString(4,a.getConfirm_pass());
                 
              status=ps.executeUpdate();
             
        }catch(Exception e)
        {
            System.out.println(e);

        }
      
        return status;
    }
    

 
public static ResultSet getAdminBean( AdminBean a)
{ResultSet rs=null;
    AdminBean ab=new AdminBean();
try{Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/database","oes","oes");
     Statement s=con.createStatement();
      PreparedStatement ps=con.prepareStatement("select *from OES.ADMIN where admin_id=? and password=? ");
        ps.setString(1,a.getAdmin_id());
        ps.setString(2, a.getPassword());
       rs=ps.executeQuery();
      
}catch(Exception e)
{
    System.out.println(e);
}
return rs;
}

      public static ResultSet updateAdminBean( AdminBean a) throws SQLException, ClassNotFoundException
    {
       ResultSet rs=null; 
     
		Class.forName("org.apache.derby.jdbc.ClientDriver");
                 Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/database","oes","oes");
                 Statement s=con.createStatement();
                 try
        {  PreparedStatement ps=con.prepareStatement("update admin set admin_name=?,admin_id=?,password=?,confirm_pass=? where admin_id='?'");
            
                  ps.setString(1, a.getAdmin_name());
                   ps.setString(2,a.getAdmin_id());
                  ps.setString(3, a.getPassword());
                   ps.setString(4,a.getConfirm_pass());
                    
            ps.executeUpdate();
             
        }catch(SQLException ex)
        {
            System.out.println(ex);

        }
      
    return rs;
    
}
      public static ResultSet deleteAdminBean( AdminBean a)
{ResultSet rs=null;
    AdminBean ab=new AdminBean();
try{Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/database","oes","oes");
     Statement s=con.createStatement();
      PreparedStatement ps=con.prepareStatement("delete from OES.ADMIN where admin_id=? ");
        ps.setString(1,a.getAdmin_id());
       
       rs=ps.executeQuery();
      
}catch(Exception e)
{
    System.out.println(e);
}
return rs;

}}