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
		//ResultSet rs = stmt.executeQuery("select * from Persons;");
		ResultSet rs1 = stmt.executeQuery("Select * from Persons Where Salary > 2000;");
		 //While Loop to iterate through all data and print results		
//			while (rs.next()){
//		        		String Lastname = rs.getString(2);								        
//                     String Firstname = rs.getString(3);	
//                     String Address = rs.getString(4);
//                     System. out.println(Firstname+"  "+Lastname+" "+Address);		
//             }		
			while(rs1.next())
			{
				String Lastname =  rs1.getString(2);
				 String Firstname = rs1.getString(3);	
                 String Address = rs1.getString(4);
                 String City = rs1.getString(5);
                 int Salary = rs1.getInt(6);
                 int Age    = rs1.getInt(7);
                 String Skill = rs1.getString(8);
                 System. out.println(Firstname+"  "+Lastname+" "+Address+" "+City+" "+Salary+" "+Age+" "+Skill);		
				
			}
			 // closing DB Connection		
			con.close();

	}

}
