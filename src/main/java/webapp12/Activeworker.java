package webapp12;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
@WebServlet(urlPatterns="/active")
public class Activeworker  extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/activeWorker.jsp").forward(request, response);
		response.setContentType("text/html; charset=UTF-8");
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
       	        try {
          // Connection conn = Connect.getConnect();
            
           
          String id =request.getParameter("id"); 
   		request.setAttribute("empid", id);
   		
   	  //String uname = uname1
   	
   		String date1 = request.getParameter("datein"); 
   		String office = request.getParameter("whichoffice");
           
         
         
            //String enddate= null;
            //String numDays= null;
            //String whoAllowed= null;
          
         
            
       	Connection cont = Connect.getConnect();
		PreparedStatement pst = (PreparedStatement) cont.prepareStatement("INSERT INTO hararhealthdb.filein(hhbidin, dateOfReturn, fromWhom) VALUES(?,?,?)");
		pst.setString(1, id);
		pst.setString(2, date1);
		pst.setString(3, office);
		//pst.setString(4, lname);
		//pst.setString(5, dateBirth);
		//pst.setString(6, jobTitle);
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
		request.setAttribute("success", "file returned Successfully!!!!");
            RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/activeWorker.jsp");
            view.forward(request, response);
           // conn.close();
           // System.out.println("Disconnected!");
        } catch (Exception e) {
            e.printStackTrace();
            request.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(request, response);
        }
  }

}
