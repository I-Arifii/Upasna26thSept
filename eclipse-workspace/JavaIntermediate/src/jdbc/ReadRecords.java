package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadRecords {
	public static void main(String[] args) {
		try {
			String url="jdbc:mysql://localhost:3306/javadb"; 
			String userName="root";
			String password="1234";//user your password
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connected successfully");
			
			/******New code**********/
			String query="select * from customer";//query to be executed against DB
			Statement stmt=con.createStatement();// to create SQL Statement
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				int phone=rs.getInt(3);
				String email=rs.getString(4);
				System.out.println("***"+id+"****"+name+"****"+phone+"****"+email+"*****");
				
			}
			/******New code**********/
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Something went wrong ");
		}	

	}

}
