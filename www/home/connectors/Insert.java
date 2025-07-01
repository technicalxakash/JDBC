package www.home.connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         System.out.println("Enter Id: ");
         int id = sc.nextInt();
         sc.nextLine(); // to consume leftover newline

         System.out.println("Enter Name: ");
         String name = sc.nextLine();

         System.out.println("Enter Marks: ");
         int marks = sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 String url = "jdbc:mysql://localhost:3306/db30";
	            // jdbc:api, mysql:DB, localhost: NW, 3306: Port, May_Dest_Jdbc: database name

	           
	            String user = "root";
	            String pwd = "akash";
	            
	            Connection con=DriverManager.getConnection(url,user,pwd);
	            
	            
	            Statement stmt=con.createStatement();
	            

	            
	            String query1 = "create table Student (id int, name varchar(10), marks int)";
	            stmt.executeUpdate(query1);

	            String query = "insert into Student values(" + id + ", '" + name + "', " + marks + ")";
	            stmt.executeUpdate(query);

	            System.out.println("Record inserted successfully.");
		} 
		
		
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
