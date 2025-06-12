

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program11 {
	  static Connection con;
	public static void main(String[] args) {
		
		 try {
		        Scanner sc = new Scanner(System.in);
		        Class.forName("com.mysql.cj.jdbc.Driver");
		        System.out.println("Driver Loaded");
		        
		        String url = "jdbc:mysql://localhost:3306/May_Dest_Jdbc";
		        String user = "root";
		        String pwd = "akash";
		        
		        con = DriverManager.getConnection(url, user, pwd);
		        System.out.println("Connection Established");

		        String sql = "Select * from student";
		        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		        ResultSet resultSet = stmt.executeQuery(sql);
		        
		        resultSet.afterLast();
		        while (resultSet.previous() == true) {
		            System.out.println(resultSet.getInt("sid"));
		            System.out.println(resultSet.getString("sname"));
		            System.out.println(resultSet.getString("school"));
		            System.out.println(resultSet.getString("class"));
		            System.out.println(resultSet.getLong("phone"));
		            System.out.println("----------");
		        }
		    } catch (ClassNotFoundException | SQLException e) {
	            System.out.println("Exception Generated and handled");
	        }
		 
		
	}

}
