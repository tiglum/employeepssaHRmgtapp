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
@WebServlet(urlPatterns="/penalityPssa")
public class Penalized extends HttpServlet {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3091243629937920283L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/jobDiscontinous.jsp").forward(request, response);
		
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
       	        try {
           Connection conn = Connect.getConnect();
            
           
           String cdate= request.getParameter("cdate"); 
           
           String  fage= request.getParameter("fage"); 
           String  sage= request.getParameter("sage"); 
           
       
            //String enddate= null;
            //String numDays= null;
            //String whoAllowed= null;
          
         
            
          List <Worker> pid_list = new ArrayList<Worker>();
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement("select hhbid, fname, sname, lname,timestampdiff(YEAR, dateOfBirth, '"+cdate+"' ),dateOfBirth,dateOfHiring,jobtitle  from hararhealthdb.employeehhb where timestampdiff(YEAR, dateOfBirth, '"+cdate+"' ) BETWEEN  '"+fage+"' and '"+sage+"'");
            
            ResultSet rs = pst.executeQuery();
             
            while (rs.next()) {
            	Worker stat = new Worker();
            
            	
          
           
                stat.setId(rs.getString(1));
                stat.setFirstName(rs.getString(2));
                stat.setSecondName(rs.getString(3));
                stat.setLastName(rs.getString(4));
                stat.setAge(rs.getString(5));
                stat.setBirth(rs.getString(6));
              
                stat.setHiringDate(rs.getString(7));
               // stat.setHiringDate(rs.getString(7));
                
                stat.setTitle(rs.getString(8));
               
                
               // System.out.println("al :: " + al);
                pid_list.add(stat);
            }    
            
          
         
            
            request.setAttribute("piList", pid_list);
           // request.setAttribute("number", count);
           
            RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/jobDiscontinous.jsp");
            view.forward(request, response);
            rs.close();
           // conn.close();
           // conn.close();
           // System.out.println("Disconnected!");
        } catch (Exception e) {
            e.printStackTrace();
        }
  }

}
