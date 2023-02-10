package webapp12;

import java.io.IOException;
import java.sql.Blob;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
@WebServlet(urlPatterns="/employeelist")
public class EmployeeList extends HttpServlet {
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/employeeList.jsp").forward(request, response);
		
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setContentType("text/html");
	   
	           
	        response.setContentType("text/html charset=UTF-8");
	        response.setCharacterEncoding("UTF-8");
	       	        try {
	           Connection conn = Connect.getConnect();
	            
	           
	        //   pid = request.getParameter("id");
	           
	       
	            String hid = request.getParameter("id"); 
	          //  String num=null;
	           // String filename=null;
	         //  Blob filetype=null;
	            //String fname = null;
	          // String sname= null;
	          // String lname = null;
      // String age= null;
	        //   String title = null;
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
	          
	         
	           List <Worker> pid_list = new ArrayList<Worker>();
	         
	            PreparedStatement pst = (PreparedStatement) conn.prepareStatement("select  hhbidDoc, filename, filetype from hararhealthdb.filedoc where hhbidDoc='"+hid+"'");
	            
	            ResultSet rs = pst.executeQuery();
	             
	            while (rs.next()) {
	            	Worker stat = new Worker();
	               
	            	 stat.setId(rs.getString(1));
	                stat.setfileName( rs.getString(2));
	               stat.setfile(rs.getBlob(3));
	             
	              
	           //   dateOfBirth = rs.getString(7);
	             //  jobTitle = rs.getString(6);
		        //   jobLevel= rs.getString(7);
		        //   jobOccupation= rs.getString(8);
	           
	              // groupBelonged = rs.getString(9);
	              // initialSalary = rs.getString(10);
	         
	           //    request.getParameter(pid1);
	        
	     //  hiringDate = rs.getString(11);
	     //  sex = rs.getString(12);
	      
	               pid_list.add(stat);
	               
	            }    
	            
	          
	         
	           // request.setAttribute("numb", num);
	           
	         //   request.setAttribute("id", hid);
	          //  request.setAttribute("fname", filename);
	          
	            request.setAttribute("piList", pid_list);
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
			request.getRequestDispatcher("/WEB-INF/views/employeeList.jsp").forward(request, response);
			
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

