package webapp12;
//import javax.resource.cci.ResultSet;

import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Validate {
	

	public static boolean checkUser(String uname, String pass, String utype) 
    {
		boolean st = false;
		/*Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        id =request.getParameter("id"); 
		request.setAttribute("empid", id);

        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "mydb";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "root";*/
		
        try {
           // Class.forName(driver).newInstance();
           // conn = (Connection) DriverManager.getConnection(url + dbName, userName, password);
        	Connection cont = Connect.getConnect();
			PreparedStatement ps=(PreparedStatement) cont.prepareStatement("select username, password, type from hararhealthdb.login where username = ? and password = ? and type=?");
       // ps.setString(1, fname);
        ps.setString(1, uname);
        ps.setString(2, pass);
        ps.setString(3, utype);
        
       // ps.setString(3, utype);
        
       ResultSet rs = (ResultSet) ps.executeQuery();
      
        	st = rs.next();
        
        
     }catch(Exception e)
     {
         e.printStackTrace();
     }
       return st;  
    
 }   


}
