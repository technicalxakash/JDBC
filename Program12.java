import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;


public class Program12 {

	public static void main(String[] args) {
	
		try {
		    Scanner sc = new Scanner(System.in);
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    System.out.println("Driver Loaded");

		    String url = "jdbc:mysql://localhost:3306/May_Dest_Jdbc";
		    String user = "root";
		    String pwd = "akash";
		    Connection con = DriverManager.getConnection(url, user, pwd);

		    String query1 = "insert into student(sname,school,class,phone) values ('Bharath','RV','12th',345678)";
		    String query2 = "insert into student(sname,school,class,phone) values ('Ram','PES','11th',9876543)";
		    String query3 = "insert into student(sname,school,class,phone) values ('Laxman','SJP','12th',7890456)";

		    Statement stmt = con.createStatement();
		    con.setAutoCommit(false);
		    stmt.addBatch(query1);
		    stmt.addBatch(query2);
		    stmt.addBatch(query3);
		    stmt.executeBatch();
		    con.commit();

		} catch (Exception e) {
		    e.printStackTrace();
		}

	}

}
