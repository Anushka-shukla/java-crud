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
		
//		String fullname = "John Cina";
		String username = "John";
//		String email = "johnCina@gmail.com";
//		String password = "cina";
//		
		
		
		try {
		   Connection connection =  DriverManager.getConnection(jdbcURL, dbUsername, dbPassword);
		   
		   //update
		   //hardcoded
		   String sql = "DELETE FROM users WHERE username=?";
		   PreparedStatement statement = connection.prepareStatement(sql);
		   statement.setString(1, username);
		   
		   int rows = statement.executeUpdate();
		   
		   if(rows> 0) {
			   System.out.println("The user information has been deleted");
		   }
		   
		   //dynamic
//		   String sql = "UPDATE users SET password=?, fullname=?, email=? WHERE username=?";
//		   PreparedStatement statement = connection.prepareStatement(sql);
//		   statement.setString(1, password); 
//		   statement.setString(2, fullname);  
//		   statement.setString(3, email); 
//		   statement.setString(4, username); 
//		   
//		   //Statement statement = connection.createStatement();
//		   
//		   int rows = statement.executeUpdate();
//		   if(rows > 0) {
//			   System.out.println("The information has been updated");
//		   }
//		   if(connection !=null) {
//			   System.out.println("Connected to the database");
		   // Inserting rows 
			   //harcoded
		   
//		       String sql = "INSERT INTO users (username, email, fullname, password)" +
//		       " VALUES ('Rajat', 'rajat123rocky@gmail.com', 'Rajat Mishra', 'rocky123rajat')";
		       
		       //query for dynamic parameters
//		       String sql = "INSERT INTO users (username, email, fullname, password)" +
//				       " VALUES (?, ?, ?, ?)";
//		       
//		       PreparedStatement statement = connection.prepareStatement(sql);
//		       statement.setString(1, username);
//		       statement.setString(2, email);
//		       statement.setString(3, fullname);
//		       statement.setString(4, password);
		       
		     //  Statement statement = connection.createStatement();
		       // Retrieve
//		       String sql = "Select * FROM users";
//		       Statement statement = connection.createStatement();
//		       ResultSet result = statement.executeQuery(sql);
//		       
//		       while(result.next()) {
//		    	   int userId = result.getInt("user_id");
//		    	   String username = result.getString("username");
//		    	   String fullname = result.getString("fullname");
//		    	   String email = result.getString("email");
//		    	   String password = result.getString("password");
//		    	   
//		    	   System.out.println(userId+":"+username+","+ fullname+ "," +email+","+password);
//		       }
		       
//		       int rows = statement.executeUpdate();
//		       if(rows>0) {
//		    	   System.out.println("A new user has been inserted successfully.");
//		       }
		       
		       
			   connection.close();
//		   }
		 
		} catch(SQLException ex) {
			ex.printStackTrace();
		}

	}

}
