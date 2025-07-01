package www.home.connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Read {

	public static void main(String[] args) {
		 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 String url = "jdbc:mysql://localhost:3306/db30";
	            // jdbc:api, mysql:DB, localhost: NW, 3306: Port, May_Dest_Jdbc: database name

	           
	            String user = "root";
	            String pwd = "akash";
	            
	            Connection con=DriverManager.getConnection(url,user,pwd);
	            
	            
	            Statement stmt=con.createStatement();

	            ResultSet rs = stmt.executeQuery("select * from Student");

	            System.out.println("Student Details:");
	            while (rs.next()) {
	                System.out.println(
	                    rs.getInt("id") + " " +
	                    rs.getString("name") + " " +
	                    rs.getInt("marks")
	                );
	            }
		}
		
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
