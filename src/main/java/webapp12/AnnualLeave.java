package webapp12;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
@WebServlet(urlPatterns = "/annual")
public class AnnualLeave extends HttpServlet {
	
	
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7587390554095804784L;
	public String hid= null;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/employeeUpdate.jsp").forward(request, response);
	}
		
		
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	hid =request.getParameter("pid"); 
	
String fname =request.getParameter("fname");
String sname =request.getParameter("sname");
String lname =request.getParameter("lname");
String dateb =request.getParameter("dateOfBirth");
String dateh =request.getParameter("dateOfHiring");
String title =request.getParameter("jobTitle");
	
	 try {
           Connection conn = Connect.getConnect();
            
          
       
            //String enddate= null;
            //String numDays= null;
            //String whoAllowed= null;
          
             
              PreparedStatement pst1 = (PreparedStatement) conn.prepareStatement("Update hararhealthdb.employeehhb set hhbid =?, fname=?, sname=?, lname=?, dateOfBirth=?, dateOfHiring=?, jobtitle=? where hhbid='"+hid+"'");
              
             
              pst1.setString(1,hid);
              pst1.setString(2, fname);
              pst1.setString(3, sname);
              pst1.setString(4, lname);
              pst1.setString(5, dateb);
              pst1.setString(6, dateh);
              pst1.setString(7, title);
             
              pst1.executeUpdate();   
            //  conn.close();
        
            
           
           // request.setAttribute("number", count);
           
            request.getRequestDispatcher("/WEB-INF/views/employeeUpdate.jsp").forward(request, response);
           
           // conn.close();
           // System.out.println("Disconnected!");
        } catch (Exception e) {
            e.printStackTrace();
            request.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(request, response);
        }

	}
}
