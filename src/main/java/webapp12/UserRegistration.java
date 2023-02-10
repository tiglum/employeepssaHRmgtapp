package webapp12;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;


@WebServlet("/UserRegistration")
public class UserRegistration extends HttpServlet{
	/**
	 * 
	 */
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * @see HttpServlet#HttpServlet()
  
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/views/userRegistration.jsp").forward(request, response);
	

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname = request.getParameter("fname"); 
		String sname = request.getParameter("sname");
		String uname = request.getParameter("uname");
		String upass = request.getParameter("upass"); 
		String utype = request.getParameter("utype");
		//request.getRequestDispatcher("/WEB-INF/views/Registration.jsp").forward(request, response);
	
	//String email = request.getParameter("email"); 
 
		try
		{      
			Connection cont = Connect.getConnect();
			PreparedStatement pst = (PreparedStatement) cont.prepareStatement("INSERT INTO hararHealthDB.login(firstname,secondname,username, password, type) VALUES(?,?,?,?,?)");
			pst.setString(1, fname);
			
			pst.setString(2, sname);
			pst.setString(3, uname);
			pst.setString(4, upass);
			pst.setString(5, utype);
			//pst.setString(3, status);
			
			pst.executeUpdate();
			request.setAttribute("success", "User created Successfully!!!!");
			request.getRequestDispatcher("/WEB-INF/views/userRegistration.jsp").forward(request, response);
			
		
			
		}
		
		catch(Exception e){
			e.printStackTrace();
			request.setAttribute("failer", "User not created"+e);
			request.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(request, response);
			
		}

	}


}
