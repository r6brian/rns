package com.rns.dataaccess;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BMIDAL {
	 
	public void readBMIRecords() {
		
		try {
			
			String myDriver = "org.gjt.mm.mysql.Driver";
			String myUrl = "jdbc:mysql://localhost/test";
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, "root", "");
			   
			String query = "SELECT * FROM BMIUsers";
			 
			Statement st = conn.createStatement();
			   
			ResultSet rs = st.executeQuery(query);
			   
			while (rs.next()) {
			
				int id = rs.getInt("id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				Date dateCreated = rs.getDate("date_created");
				boolean isAdmin = rs.getBoolean("is_admin");
				int numPoints = rs.getInt("num_points");
				 
				System.out.format("%s, %s, %s, %s, %s, %s\n", id, firstName, lastName, dateCreated, isAdmin, numPoints);
			}
			st.close();
		}
		catch (Exception e)
		{
		  System.err.println("Got an exception! ");
		  System.err.println(e.getMessage());
		}
	}
}
