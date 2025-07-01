package www.home.connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

//creating the database
public class Program2 {

	public static void main(String[] args)  {
		
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the database name to create");
        String dbname=sc.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 String url = "jdbc:mysql://localhost:3306";
	            // jdbc:api, mysql:DB, localhost: NW, 3306: Port, May_Dest_Jdbc: database name

	           
	            String user = "root";
	            String pwd = "akash";
	            
	            Connection con=DriverManager.getConnection(url,user,pwd);
	            
	            
	            Statement stmt=con.createStatement();
	            

	            
				//create a database
				String sql="create database "+dbname;
				int a=stmt.executeUpdate(sql);
				System.out.println("Database created sucessfully");
		} 
		
		
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
