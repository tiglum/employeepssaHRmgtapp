package webapp12;

import java.io.IOException;
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
@WebServlet(urlPatterns="/permanent")
public class Permanency extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5376022007022513455L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/notPermanent.jsp").forward(request, response);
		
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
       	        try {
           Connection conn = Connect.getConnect();
            
           
           String cdate = request.getParameter("cdate");
           
           String count= null;
         
            //String enddate= null;
            //String numDays= null;
            //String whoAllowed= null;
          
         
            
          List <Worker> pid_list = new ArrayList<Worker>();
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement("select hhbid, Jobtitle,fname, sname, lname, dateOfBirth from hararhealthdb.employeehhb where (select(select DATEDIFF('"+cdate+"', dateOfBirth)) between  21535 and 22265)");
            
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
            request.setAttribute("number", count);
           
            RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/notPermanent.jsp");
            view.forward(request, response);
            
           // conn.close();
           // System.out.println("Disconnected!");
        } catch (Exception e) {
            e.printStackTrace();
        }
  }

	

}
