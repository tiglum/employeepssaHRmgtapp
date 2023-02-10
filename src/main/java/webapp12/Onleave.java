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
@WebServlet(urlPatterns="/leave")
public class Onleave extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7461527976482940646L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/leave.jsp").forward(request, response);
		
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
       	        try {
           Connection conn = Connect.getConnect();
            
           
            String title = request.getParameter("title");
           // String sdate= request.getParameter("sdate");
            //String id= null;
         
            //String enddate= null;
            //String numDays= null;
            //String whoAllowed= null;
          
         
            List <Worker> pid_list = new ArrayList<Worker>();
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement("select hhbid, Jobtitle,fname, sname, lname, dateOfBirth from hararhealthdb.employeehhb where jobtitle='"+title+"'");
            
            ResultSet rs = pst.executeQuery();
             
            while (rs.next()) {
            	Worker stat = new Worker();
            
            	  stat.setId(rs.getString(1));
            	  stat.setTitle(rs.getString(2));
                  stat.setFirstName(rs.getString(3));
                  stat.setSecondName(rs.getString(4));
                  stat.setLastName(rs.getString(5));
                  stat.setAge(rs.getString(6));
                  
              //    count = rs.getString(6);
                
               // System.out.println("al :: " + al);
                pid_list.add(stat);
            }    
            
          
         
            
            request.setAttribute("piList", pid_list);
      
           
            RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/leave.jsp");
            view.forward(request, response);
            rs.close();
           // conn.close();
           // conn.close();
           // System.out.println("Disconnected!");
        } catch (Exception e) {
            e.printStackTrace();
            request.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(request, response);
        }
  }

}
