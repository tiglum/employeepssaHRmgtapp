package webapp12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.mysql.jdbc.Blob;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

@WebServlet(urlPatterns = "/employeeAddress")
public class EmployeeAddress extends HttpServlet {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		request.getRequestDispatcher("/WEB-INF/views/employeeAdress.jsp").forward(request, response);
		
}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		  PrintWriter out = response.getWriter();
         
		 InputStream inputStream = null; 
		 Random rand = new Random();
		 int n = rand.nextInt(9999) + 1;
		 String idTemp = (String.valueOf(n));
				String did = request.getParameter("hid"); 
					
					String fname1 = request.getParameter("name");
					 //FileInputStream fis;
				//String filePart = request.getParameter("photo");
			Part filePart=request.getPart("photo");
			//String fileName = Paths.get(((Object) filePart).getSubmittedFileName()).getFileName().toString();
				            // prints out some information for debugging
				     //   InputStream inputstream=null;     
	            // obtains input stream of the upload file
			
			if (filePart != null) {
	            // prints out some information for debugging
	            System.out.println(filePart.getName());
	          System.out.println(filePart.getSize());
	           System.out.println(filePart.getContentType());
	             
	            // obtains input stream of the upload file
	           inputStream = filePart.getInputStream();
	        }
		
		//request.getRequestDispatcher("/WEB-INF/views/Registration.jsp").forward(request, response);
	
	//String email = request.getParameter("email"); 
 
		try
		{ 
		 
			Connection cont = Connect.getConnect();
			PreparedStatement pst = (PreparedStatement) cont.prepareStatement("INSERT INTO hararhealthdb.filedoc(hhbidDoc, filename, filetype) VALUES(?, ?, ?)");
			pst.setString(1, did);
			pst.setString(2, fname1);
		//	pst.setString(3, filePart);
			//pst.setString(3, status);
		 // if (inputStream != null) {
	                // fetches input stream of the upload file for the blob column
	              pst.setBinaryStream(3, inputStream,  filePart.getSize());
	          //  }
		    int row = pst.executeUpdate();
	       if (row > 0) {
	            	request.setAttribute("success", "employee file inserted Successfully!!!!");
	            	
	            	request.getRequestDispatcher("/WEB-INF/views/employeeAdress.jsp").forward(request, response);
	          }else {
			
			
			
	          }
			// pst.close();
		     // cont.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
			request.setAttribute("failer", "There is a problem to insert employee file");
			request.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(request, response);
			
		}
	

}
}