import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessing {

	public static void main(String[] args)  {
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 String url = "jdbc:mysql://localhost:3306/db30";
	          // jdbc:api, mysql:DB, localhost: NW, 3306: Port, May_Dest_Jdbc: database name

	         
	          String user = "root";
	          String pwd = "akash";
	          
	          Connection con=DriverManager.getConnection(url,user,pwd);
			
			Statement stmt=con.createStatement();
			String sql="insert into Student values(102,'nikle',99)";
			
			stmt.addBatch(sql);
			
			String sql2="update student set name='nihal' where id=101";
			
			stmt.addBatch(sql2);
			
			String sql3="delete from Student where id=102";
			stmt.addBatch(sql3);
			
			int [] a=stmt.executeBatch();
			
			
			
			
		} catch (ClassNotFoundException |SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
