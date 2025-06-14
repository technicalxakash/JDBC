import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mysql.cj.jdbc.CallableStatement;

public class Program13 {

	public static void main(String[] args) {
		
		try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    System.out.println("Driver is loaded");

		    String url = "jdbc:mysql://localhost:3306/May_Dest_Jdbc";
		    String user = "root";
		    String pwd = "akash";
		    Connection con = DriverManager.getConnection(url, user, pwd);

		    if (con == null) {
		        System.out.println("Connection is not established");
		    } else {
		        CallableStatement call = (CallableStatement) con.prepareCall("{call proceedure1(?)}");
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the id : ");
		        call.setInt(1, sc.nextInt());

		        ResultSet resultSet = call.executeQuery();
		        while (resultSet.next() == true) {
		            System.out.println(resultSet.getInt(1));
		            System.out.println(resultSet.getString(2));
		            System.out.println(resultSet.getString(3));
		            System.out.println(resultSet.getString(4));
		            System.out.println(resultSet.getLong(5));
		        }
		    }
		}
		    catch (Exception e) {
			    e.printStackTrace();
			}
			
		}
		
	}


