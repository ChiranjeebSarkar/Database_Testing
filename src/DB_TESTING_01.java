import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_TESTING_01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/sys?characterEncoding=latin1&useConfigs=maxPerformance";
		String username = "root";
		String password = "chiranjeeb";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl,username,password);
		
		Statement stmt = con.createStatement();	
		System.out.println("Connection Established ");
		ResultSet rs = stmt.executeQuery("select * from Persons;");
		 //While Loop to iterate through all data and print results		
			while (rs.next()){
		        		String Lastname = rs.getString(2);								        
                     String Firstname = rs.getString(3);	
                     String Address = rs.getString(4);
                     System. out.println(Firstname+"  "+Lastname+" "+Address);		
             }		
			 // closing DB Connection		
			con.close();

	}

}
