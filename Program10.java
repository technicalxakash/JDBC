//using metadata displaying coloumn name
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.result.CachedResultSetMetaData;

public class Program10 {

	public static void main(String[] args) {
		 try {
	            // Step 1: Load the driver
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            System.out.println("Driver is loaded");

	            // Step 2: Establish Connection
	            String url = "jdbc:mysql://localhost:3306/May_Dest_Jdbc";
	            String user = "root";
	            String pwd = "akash";
	            Connection con = DriverManager.getConnection(url, user, pwd);
	            
	            if (con == null) {
	                System.out.println("Connection is not established");
	            } else {
	                System.out.println("Connection is established");
	                String sql = "Select * from student where sid = ?";
	                PreparedStatement pstmt = con.prepareStatement(sql);
	                System.out.println("Enter sid : ");
	                Scanner sc=new Scanner(System.in);
	                pstmt.setInt(1,sc.nextInt());	                
	                ResultSet res = pstmt.executeQuery();
//	                while(res.next()==true) {
//	                	System.out.println(res.getInt("sid"));
//	                	System.out.println(res.getString("sname"));
//	                	System.out.println(res.getString("school"));
//	                	System.out.println(res.getString("class"));
//	                	System.out.println(res.getLong("phone"));
//	                }
//	                }
	            
	                System.out.println("============================");
	                ResultSetMetaData metaData = res.getMetaData();
	                int count = metaData.getColumnCount();
	                System.out.println("Column count = "+count);
	                for(int i=1;i<=count;i++) {
	                System.out.println(metaData.getColumnName(i));
	                System.out.println(metaData.getColumnTypeName(i));
	                System.out.println(metaData.getSchemaName(i));
	                System.out.println(metaData.isNullable(i));
	                System.out.println("=========================");
	                }
	                }
	                

	        } catch (ClassNotFoundException | SQLException e) {
	            System.out.println("Exception Generated and handled");
	        }



	}

}
