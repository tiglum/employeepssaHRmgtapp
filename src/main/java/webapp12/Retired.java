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
@WebServlet(urlPatterns="/retired")

public class Retired extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5351648026516264091L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/retiredPssa.jsp").forward(request, response);
		
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
       	        try {
           Connection conn = Connect.getConnect();
            
           
           String id= request.getParameter("hhid");    

       
            //String enddate= null;
            //String numDays= null;
            //String whoAllowed= null;
          
         
            
          List <Status> pid_list = new ArrayList<Status>();
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement("select hhbidin, dateout,towhome, reason,dateOfReturn,fromWhom from hararhealthdb.filein, hararhealthdb.fileout where filein.hhbidin and fileout.hhbidout and  hhbidin= '" + id + "'");
            
            ResultSet rs = pst.executeQuery();
             
            while (rs.next()) {
            	Status stat = new Status();
            
            	
          
           
                stat.setIdNumber(rs.getString(1));
            
                stat.setStartingDate(rs.getString(2));
                stat.settowhom(rs.getString(3));
                stat.setReason(rs.getString(4));
                
                stat.setEndingDate(rs.getString(5));
                stat.setfromwhom(rs.getString(6));
                
                
               // System.out.println("al :: " + al);
                pid_list.add(stat);
            }    
            
          
         
            
            request.setAttribute("piList", pid_list);
           // request.setAttribute("number", count);
           
            RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/retiredPssa.jsp");
            view.forward(request, response);
            rs.close();
          //  conn.close();
           // conn.close();
           // System.out.println("Disconnected!");
        } catch (Exception e) {
            e.printStackTrace();
        }
  }


}
