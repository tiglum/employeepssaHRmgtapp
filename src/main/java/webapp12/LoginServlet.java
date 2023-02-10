package webapp12;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns="/login")
public class LoginServlet extends HttpServlet{
	
	public String uname=null;
	/**
	 * 
	 */
	private static final long serialVersionUID = 5867152500323870157L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		
		
	}              

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  

        response.setContentType("text/html");  
		uname =request.getParameter("uname"); 
		 request.setAttribute("uname1", uname);
        
     //   String name=request.getParameter("uname");  
        
        String pass=request.getParameter("upass"); 
        String type=request.getParameter("utype"); 
        HttpSession session = request.getSession(false);
        if(session!=null)
        //session.setAttribute("name", name);

        if(Validate.checkUser(uname, pass, type)){ 
        if(type.equals("admin")){
            RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/views/menu.jsp");  
            rd.forward(request,response);
         
            
         }else if(type.equals("executive")){
              RequestDispatcher rd2=request.getRequestDispatcher("/WEB-INF/views/menu3.jsp");  
              rd2.forward(request,response);  

            
        }else if(type.equals("user")){
       	 RequestDispatcher rd1=request.getRequestDispatcher("/WEB-INF/views/menu1.jsp");  
            rd1.forward(request,response); } 
       
              
        } else{  
        	request.setAttribute("failer", "Either your User name or Password is not correct!!!");
            RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/views/index.jsp");  
            rd.include(request,response);  
        }  
        
    }  

}
