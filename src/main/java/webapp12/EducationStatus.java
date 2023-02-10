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
@WebServlet(urlPatterns = "/employeeEducation")
public class EducationStatus extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 public static String pid1=null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/educationStatus.jsp").forward(request, response);
		
}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html charset=UTF-8");
	        response.setCharacterEncoding("UTF-8");
	       	        try {
	           Connection conn = Connect.getConnect();
	            
	           
	        //   pid = request.getParameter("id");
	           
	       
	            String fname = request.getParameter("fname"); 
	            String sname = request.getParameter("sname"); 
	           String curdate= request.getParameter("currentDate");
	            //String fname = null;
	          // String sname= null;
	           String lname = null;
       String age= null;
	           String title = null;
	      //    String dateOfBirth= null;
	         //  String jobTitle = null;
	         //  String jobLevel= null;
	         //  String permanent = null;
	         //  String groupBelonged= null;
	         //  String initialSalary = null;
	         //  String hiringDate= null;
	        //  String  jobOccupation= null;
	            //String enddate= null;
	            //String numDays= null;
	            //String whoAllowed= null;
	          
	         
	            
	         
	            PreparedStatement pst = (PreparedStatement) conn.prepareStatement("select hhbid, fname, sname, lname, timestampdiff(YEAR, dateOfBirth, '"+curdate+"' ), jobtitle from hararhealthdb.employeehhb where fname='"+fname+"' and  sname='"+sname+"'");
	            
	            ResultSet rs = pst.executeQuery();
	             
	            while (rs.next()) {
	            	//Status stat = new Status();
	               
	             
	                pid1= rs.getString(1);
	               fname= rs.getString(2);
	               sname = rs.getString(3);
	               lname = rs.getString(4);
	               age = rs.getString(5);
	               title = rs.getString(6);
	           //   dateOfBirth = rs.getString(7);
	             //  jobTitle = rs.getString(6);
		        //   jobLevel= rs.getString(7);
		        //   jobOccupation= rs.getString(8);
	           
	              // groupBelonged = rs.getString(9);
	              // initialSalary = rs.getString(10);
	         
	           //    request.getParameter(pid1);
	        
	     //  hiringDate = rs.getString(11);
	     //  sex = rs.getString(12);
	      
       
	               
	            }    
	            
	          
	         
	            request.setAttribute("title", title);
	           
	            request.setAttribute("fname", fname);
	            request.setAttribute("sname", sname);
	          
		request.setAttribute("hhid", pid1);
				request.setAttribute("lname", lname);
				request.setAttribute("age", age);
				//request.setAttribute("sex", sex);
				//request.setAttribute("dbirth", dateOfBirth);
				//request.setAttribute("jtitle", jobTitle);
			//	request.setAttribute("jlevel", jobLevel);
			//	request.setAttribute("permanent", permanent);
			//	request.setAttribute("gbelonged", groupBelonged);
			//	request.setAttribute("isalary", initialSalary);
			//	request.setAttribute("hdate", hiringDate);
				
				//request.setAttribute("joccupation", jobOccupation);
			//request.setAttribute("success", "education status inserted Successfully!!!!");
			request.getRequestDispatcher("/WEB-INF/views/educationStatus.jsp").forward(request, response);
			
			// pst.close();
		     // cont.close();
			
		}
		 
		catch(Exception e){
			e.printStackTrace();
			request.setAttribute("failer", "there is a problem  to search a status ");
			request.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(request, response);
			
		}
	}

}
