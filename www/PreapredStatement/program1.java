package www.PreapredStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class program1 {

	public static void main(String[] args)  {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 String url = "jdbc:mysql://localhost:3306/db30";
	           // jdbc:api, mysql:DB, localhost: NW, 3306: Port, May_Dest_Jdbc: database name

	          
	           String user = "root";
	           String pwd = "akash";
	           
	           Connection con=DriverManager.getConnection(url,user,pwd);
	           
	           //insert
//	           String sql="insert into Student values(?,?,?)";
//	           
//	           PreparedStatement pstmt=con.prepareStatement(sql);
//	           
//	           pstmt.setInt(1, 2);
//	           pstmt.setString(2, "akash");
//	           pstmt.setInt(3, 98);
//	           
//	           pstmt.executeUpdate();
//	           
//	           pstmt.setInt(1, 102);
//	           pstmt.setString(2, "vishal");
//	           pstmt.setInt(3, 97);
//	           
//	           pstmt.executeUpdate();
	           
	           //update
//	           String sql="update Student set name=? where id=?" ;
//	           
//	           PreparedStatement pstm=con.prepareStatement(sql);
//	           
//	           pstm.setString(1,"kishoor");
//	           pstm.setInt(2, 101);
//	           
//	           pstm.executeUpdate();
	           
	           //delete
	           String sql="delete from Student where id=?";
	           PreparedStatement pstm=con.prepareStatement(sql);
	           
	           pstm.setInt(1, 102);
	           
	           pstm.executeUpdate();
	           
	           
		} 
		
		
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
