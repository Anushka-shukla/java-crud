package net.codejava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsersManager {
	public static void main(String[] args) {
		String jdbcURL = "jdbc:mysql://localhost:3306/sampleDB";
		String dbUsername ="root";
		String dbPassword ="anu99shukla@S";
		
			
		try {
		   Connection connection =  DriverManager.getConnection(jdbcURL, dbUsername, dbPassword);
		  // Retrieve
		    String sql = "Select * FROM users";
		    Statement statement = connection.createStatement();
		    ResultSet result = statement.executeQuery(sql);
		    
		while(result.next()) {
			   int userId = result.getInt("user_id");
		 	   String username = result.getString("username");
		 	   String fullname = result.getString("fullname");
		 	   String email = result.getString("email");
		 	   String password = result.getString("password");
		 	   System.out.println(userId+":"+username+ ", "+ fullname+ ", "+ email+ ", "+ password);
		}
		  
			   connection.close();	 
		} catch(SQLException ex) {
			ex.printStackTrace();
		}

	}

}

