package www.home.connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID to delete: ");
        int id = sc.nextInt();
        
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 String url = "jdbc:mysql://localhost:3306/db30";
	            // jdbc:api, mysql:DB, localhost: NW, 3306: Port, May_Dest_Jdbc: database name

	           
	            String user = "root";
	            String pwd = "akash";
	            
	            Connection con=DriverManager.getConnection(url,user,pwd);
	            
	            
	            Statement stmt=con.createStatement();

	            String query = "delete from Student where id=" + id;
	            stmt.executeUpdate(query);

	            System.out.println("Record deleted successfully.");
		}
		
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
