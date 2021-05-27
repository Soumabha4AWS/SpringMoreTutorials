package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login2.do")
public class LoginServlet2 extends HttpServlet {

	
	private static final long serialVersionUID = 6915413043295169058L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setAttribute("name", request.getParameter("param"));
		request.getRequestDispatcher("/WEB-INF/views/login2.jsp").forward(request, response);
	}

}