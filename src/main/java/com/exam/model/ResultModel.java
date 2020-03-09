
package com.exam.model;

import com.exam.bean.ResultBean;
import com.exam.bean.UserBean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ResultModel {
        
   public int insertResultBean( ) throws SQLException, ClassNotFoundException
    {
      
      int status=0;
      System.out.println("mmmmmmmmmmmm");
      
		Class.forName("org.apache.derby.jdbc.ClientDriver");
                 Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/database","oes","oes");
                 Statement s=con.createStatement();
                 try
        {   System.out.println("jhjjjjjjjjjjjjjjjjjjjjj");
        
        PreparedStatement ps=con.prepareStatement("insert into result(user_id,user_name,exam_id,exam_name) "
                + "values(uid,unm,exid,exnm");
                            System.out.println("mlllllllllllllllllll");
                     status=ps.executeUpdate();
                
           System.out.println("laaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
             
        }catch(SQLException ex)
        {
            System.out.println(ex);

        }
      
        return status;
    }
 
 public static ResultSet getExamBean( ResultBean u)
{ResultSet rs=null;
    ResultBean ub=new ResultBean();
try{Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/database","oes","oes");
     Statement s=con.createStatement();
      PreparedStatement ps=con.prepareStatement("select user_id from oes.exuser where user_id=? or select *from OES.EXAM where exam_id=? and exam_name=? ");
       ps.setString(1,u.getUser_id());
             ps.setString(2,u.getExam_name());
        ps.setInt(3, u.getExam_id());
       rs=ps.executeQuery();
      
}catch(Exception e)
{
    System.out.println(e);
}
return rs;
}
    
}
