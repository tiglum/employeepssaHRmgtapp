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


@WebServlet(urlPatterns = "/employeeStatus")
public class EmployeeStatus extends HttpServlet {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	public String id= null;
	public  String sex=null;
	public  int numdays;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/employeeJobStatus.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id =request.getParameter("id"); 
		request.setAttribute("empid", id);
		String reason = request.getParameter("reason"); 
		String startingDate = request.getParameter("startingDate");
		
		String endingDate = request.getParameter("endingDate"); 
		String yearDay = request.getParameter("numberOfDays");
		String whoAllowed = request.getParameter("whoAllowed");
		
		

	
	
		//request.getRequestDispatcher("/WEB-INF/views/Registration.jsp").forward(request, response);
	
	//String email = request.getParameter("email"); 
 
		try
		{
		
		
			// request.setAttribute("days", yearDay);
			// request.setAttribute("hiring", hiring);
			// request.setAttribute("num", jobex );
			Connection cont = Connect.getConnect();
			PreparedStatement pst = (PreparedStatement) cont.prepareStatement("INSERT INTO hararpsssa.employee_job_status(reason, starting_date, ending_date, number_of_days, person_who_allowed, employee_information_status) VALUES(?,?,?,?,?,?)");
			pst.setString(1, reason);
			pst.setString(2, startingDate);
			pst.setString(3, endingDate);
			pst.setNString(4,  yearDay);
			pst.setString(5, whoAllowed);
			pst.setString(6, id);
			
			//pst.setString(3, status);
			
			pst.executeUpdate();
			request.setAttribute("success", "Employee status inserted Successfully!!!!");
			request.getRequestDispatcher("/WEB-INF/views/employeeJobStatus.jsp").forward(request, response);
			
			 pst.close();
		      //cont.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
			request.setAttribute("failer", "Employee status not inserted");
			request.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(request, response);
			
		}
	}

	

}
