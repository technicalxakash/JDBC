package www.home.connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class program1 {

	public static void main(String[] args)   {

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				 String url = "jdbc:mysql://localhost:3306";
		            // jdbc:api, mysql:DB, localhost: NW, 3306: Port, May_Dest_Jdbc: database name

		           
		            String user = "root";
		            String pwd = "akash";
				
				Connection con=DriverManager.getConnection(url, user, pwd);
				System.out.println("Connected successfully");
			
			
		} 
			catch (ClassNotFoundException  | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		}

}