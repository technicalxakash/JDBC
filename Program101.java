import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program101 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
			
		//Load and register the driver
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 String url = "jdbc:mysql://localhost:3306/mrng";
	            // jdbc:api, mysql:DB, localhost: NW, 3306: Port, May_Dest_Jdbc: database name

	           
	            String user = "root";
	            String pwd = "akash";
			
			Connection con=DriverManager.getConnection(url, user, pwd);
			System.out.println("Connected successfully");
			
			//create statement
			Statement stmt=con.createStatement();
			
			//exceute the statement
			
			//create a database
//			String sql="create database mrng";
//			int a=stmt.executeUpdate(sql);
//			System.out.println("Database created sucessfully");
			
			
			//create a table
//			String sql="create table Employee(id int,name varchar(30) ,dob date)";
//			int a=stmt.executeUpdate(sql);
//			System.out.println("Table created sucessfully");
			
			//alter
			//1)add coloum to the existing table 
//			String sql="alter table Employee add column designation varchar(100)";
//			int a=stmt.executeUpdate(sql);
//			System.out.println("add coloum to the existing table sucessfully");
			
			//2)Rename the coloumn name
//			String sql="alter table Employee rename column designation to departmentname";
//			int a=stmt.executeUpdate(sql);
//			System.out.println("Rename the column name");
			
			//3) drop column name
//			String sql="alter table Employee drop column departmentname";
//			int a=stmt.executeUpdate(sql);
//			System.out.println("drop column name");	
			
			//4) Modify the dataType
//			String sql="alter table Employee modify name varchar(40)";
//			int a=stmt.executeUpdate(sql);
//			System.out.println("Modify the dataType");	
			
			
			//inserting the values
//			String sql="insert into Employee values(1,'akash','2022-07-29')";
//			int a=stmt.executeUpdate(sql);
//			System.out.println("inserting the values");	
			
			
			//updating the value
//			String sql="update Employee set name='kamal' where name='akash'";
//			int a=stmt.executeUpdate(sql);
//			System.out.println("updating the value");
			
			//deleting  the specific value
//			String sql="update Employee set name='kamall' where name='kamal'";
//			int a=stmt.executeUpdate(sql);
//			System.out.println("deleting  the specific value");
			
//DQL		
			//how to retrive records from the database
			
			//create the statemnet
			
			String sql="select * from Employee";
			ResultSet rs= stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getDate(3));
				
			}
			
			System.out.println("getting successfuly========");
			
		} 
		
		
		
		
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
