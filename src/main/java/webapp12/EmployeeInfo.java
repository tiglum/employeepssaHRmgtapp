package webapp12;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
@WebServlet(urlPatterns = "/employee")
@MultipartConfig
public class EmployeeInfo extends HttpServlet {
	/**
	 * 
	 */
	public String id= null;
   public String uname=null;
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/employeeInfo.jsp").forward(request, response);
		
}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		id =request.getParameter("id"); 
		request.setAttribute("empid", id);
		
	  //String uname = uname1
		request.setAttribute("uname1", uname);
		String fname = request.getParameter("fname"); 
		String sname = request.getParameter("sname");
		
		String lname = request.getParameter("lname");
        
		//String sex = request.getParameter("sex");
		String dateBirth = request.getParameter("dateOfBirth");
		String dateOfHiring = request.getParameter("dateOfHiring");
		String jobTitle = request.getParameter("jobTitle");
		//String jobLevel = request.getParameter("jobLevel");
		//String hiringType = request.getParameter("hiringType");
		//String group = request.getParameter("group");
		//String initialSalary = request.getParameter("intialSalary");
		//String hiringDate = request.getParameter("hiringDate");
		
		//request.getRequestDispatcher("/WEB-INF/views/Registration.jsp").forward(request, response);
	
	//String email = request.getParameter("email"); 
		
		
		

 
		try
		{  
		if(id.length()==0){request.setAttribute( "emptyId", "Enter ID number please!!!");}
		else if(fname.length()==0){request.setAttribute( "emptyFname", "Enter first name please!!!");}
		else if(sname.length()==0){ request.setAttribute( "emptySname", "Enter second name please!!!");}
		else if(lname.length()==0){request.setAttribute( "emptyLname", "Enter last name  please!!!");}
		//else if(age.length()==0){request.setAttribute( "emptyAge", "Enter age please!!!");}
		//else if(sex.length()==0){request.setAttribute( "emptySex", "Enter sex  please!!!");}
		else if (dateBirth.length()==0){request.setAttribute( "emptyBirth", "Enter Birth date please!!!");}
		else if (jobTitle.length()==0){request.setAttribute( "emptyJobTitle", "Enter job title  please!!!");}
		//else if (jobLevel.length()==0){request.setAttribute( "emptyJobLevel", "Enter job level please!!!");}
		//else if (hiringType.length()==0){request.setAttribute( "emptyHiringType", "Enter hiring type please!!!");}
		//else if (group.length()==0){request.setAttribute( "emptyGroup", "Enter group it belonged please!!!");}
		//else if (initialSalary.length()==0){request.setAttribute( "emptyIntialS", "Enter intial salary  please!!!");}
		//else if (hiringDate.length()==0){request.setAttribute( "emptyHiringDate", "Enter hiring date please!!!");}
		
		
			Connection cont = Connect.getConnect();
			PreparedStatement pst = (PreparedStatement) cont.prepareStatement("INSERT INTO hararhealthdb.employeehhb(hhbid, fname, sname, lname, dateOfBirth, dateOfHiring, jobtitle) VALUES(?,?,?,?,?,?,?)");
			pst.setString(1, id);
			pst.setString(2, fname);
			pst.setString(3, sname);
			pst.setString(4, lname);
			pst.setString(5, dateBirth);
			pst.setString(6, dateOfHiring);
			pst.setString(7, jobTitle);
			//pst.setString(7, uname);
			//pst.setString(7, jobLevel);
		//	pst.setString(8, hiringType);
			//pst.setString(9, group);
			//pst.setString(10, initialSalary);
			//pst.setString(11, hiringDate);
			//pst.setString(12, sex);
			//pst.setString(13, age);
			//pst.setString(3, status);
			
			pst.executeUpdate();
			request.setAttribute("success", "User created Successfully!!!!");
			request.getRequestDispatcher("/WEB-INF/views/employeeInfo.jsp").forward(request, response);
			
			
		}
		catch(Exception e){
			e.printStackTrace();
			request.setAttribute("failer", "User not created");
			request.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(request, response);
			
		}

	}
}