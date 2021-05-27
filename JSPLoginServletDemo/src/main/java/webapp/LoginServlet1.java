package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//Java Platform, Enterprise Edition (Java EE) JEE6

/* 
* 
*  Servlet is a Java programming language class used to extend the capabilities of servers 
*  that host applications accessed by means of a request-response programming model.
*  1. extends javax.servlet.http.HttpServlet
*  2. @WebServlet(urlPatterns = "/login1.do")
*  3. doGet(HttpServletRequest request, HttpServletResponse response)
*  4. How is the response created?
*  
*/

@WebServlet(urlPatterns = "/login1.do")
public class LoginServlet1 extends HttpServlet {

	
	private static final long serialVersionUID = 6578065519330860988L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		System.out.println("************ First JSP Page Starts *************");
		request.getRequestDispatcher("/WEB-INF/views/login1.jsp").forward(request, response);
		System.out.println("************ First JSP Page Ends *************");
	}

}