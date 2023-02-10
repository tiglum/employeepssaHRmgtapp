package webapp12;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
@WebServlet(urlPatterns = "/employeeExperience")
public class EmployeeExperience extends HttpServlet {


	/**
	 * 
	 */
	//public String id = null;
	private static final long serialVersionUID = 1L;
	public String pst= null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/employeeExperience.jsp").forward(request, response);
		
}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String id =request.getParameter("id"); 
		request.setAttribute("empid", id);
		String dout = request.getParameter("dateout"); 
		String woffice = request.getParameter("whichoffice");
		
		String reason = request.getParameter("raeson"); 
		//String startingDate = request.getParameter("startingDate");
		//String endingDate = request.getParameter("endingDate");
		//String numYear = request.getParameter("numberOfYears");
		
		
		//request.getRequestDispatcher("/WEB-INF/views/Registration.jsp").forward(request, response);
	
	//String email = request.getParameter("email"); 
 
		try
		{      
			Connection cont = Connect.getConnect();
			PreparedStatement pst = (PreparedStatement) cont.prepareStatement("INSERT INTO hararhealthdb.fileout(hhbidout, dateout, towhome,reason) VALUES(?,?,?,?)");
			pst.setString(1, id);
			pst.setString(2, dout);
			pst.setString(3, woffice);
			pst.setString(4, reason);
			//pst.setString(5, endingDate);
			//pst.setString(6, numYear);
			//pst.setString(7, id);
			
			//pst.setString(3, status);
			
			pst.executeUpdate();
			request.setAttribute("success", "file out registerd Successfully!!!!");
			request.getRequestDispatcher("/WEB-INF/views/employeeExperience.jsp").forward(request, response);
			
			 try{
		         if(pst!=null)
		            pst.close();
		      }catch(SQLException se2){
		      }// nothing we can do
		      
		}
		catch(Exception e){
			e.printStackTrace();
			request.setAttribute("failer", "There is a problem to to register file");
			request.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(request, response);
			
		}
		
	}

}
