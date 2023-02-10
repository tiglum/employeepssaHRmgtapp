package webapp12;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/report")
public class Report extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1775434098064372833L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd2=request.getRequestDispatcher("/WEB-INF/views/menu3.jsp");  
        rd2.forward(request,response);   
}
}