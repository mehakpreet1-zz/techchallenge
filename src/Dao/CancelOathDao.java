package Dao;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import bean.Bean;
import ravi.util.DBConnectionManager;

public class CancelOathDao {
	
	
	
	
	 public void cancel(Bean bean) throws SQLException{
         
		 Connection con = (Connection) DBConnectionManager.getConnection();
	       
	        PreparedStatement ps=null;
	        System.out.println("**** ps****");
	        String query = "delete from company where m_uuid = ?";
	        ps = (PreparedStatement) con.prepareStatement(query);
	        ps.setString(1, bean.getCreator().getUuid());
	        ps.executeUpdate();
	      }
	        
     
 

}

