package webapp12;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class Connect {

	private static Connection connect;
	
	public static Connection getConnect()
	{
		 if(connect== null){          
			                                       
			 try     
		 	 {
				Class.forName("com.mysql.jdbc.Driver");
				 String url = "jdbc:mysql://localhost:3306/hararhealthdb?useUnicode=true&characterEncoding=utf-8";
				 String username= "root";
				 String password = "admin";
				 DriverManager.registerDriver(new com.mysql.jdbc.Driver());
				 connect = (Connection) DriverManager.getConnection(url, username, password);
			 }
			 catch(Exception ex){
				 System.out.println(" connection problem"+ex);
				 
			 }
		
		 }
		 return connect;

	}
}
	


