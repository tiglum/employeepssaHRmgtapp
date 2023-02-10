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
@WebServlet(urlPatterns="/promot")
public class PromotionLevel extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2093688072084179778L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/penality.jsp").forward(request, response);
		
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
       	        try {
           Connection conn = Connect.getConnect();
            
           
           String cdate= request.getParameter("cdate"); 
           
           String  fage= request.getParameter("fage"); 
           String  sage= request.getParameter("sage"); 
         //  int count= 0;
         
            //String enddate= null;
            //String numDays= null;
            //String whoAllowed= null;
          
         
            
          List <Worker> pid_list = new ArrayList<Worker>();
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement("select hhbid, fname, sname, lname,timestampdiff(YEAR, dateOfBirth, '"+cdate+"' ), timestampdiff(YEAR, dateOfHiring, '"+cdate+"' ),dateOfBirth , jobtitle, dateOfHiring from hararhealthdb.employeehhb where timestampdiff(YEAR, dateOfHiring, '"+cdate+"' ) BETWEEN  '"+fage+"' and '"+sage+"'");
            
            ResultSet rs = pst.executeQuery();
             
            while (rs.next()) {
            	Worker stat = new Worker();
                
            	
                
                
                stat.setId(rs.getString(1));
                stat.setFirstName(rs.getString(2));
                stat.setSecondName(rs.getString(3));
                stat.setLastName(rs.getString(4));
                stat.setAge(rs.getString(5));
                stat.setExperience(rs.getString(6));
                stat.setBirth(rs.getString(7));
                stat.setTitle(rs.getString(8));
                stat.setHiringDate(rs.getString(9));
               
          //  count = rs.getInt(13);
                
               // System.out.println("al :: " + al);
                pid_list.add(stat);
            }    
            
          
            //count = count-1;
            
            
            request.setAttribute("piList", pid_list);
          //  request.setAttribute("number", count);
           
            RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/penality.jsp");
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
