package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login3.do")
public class LoginServlet3 extends HttpServlet {

	private static final long serialVersionUID = -1386164579983900096L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setAttribute("name", request.getParameter("param1"));
		request.setAttribute("password", request.getParameter("param2"));
		request.getRequestDispatcher("/WEB-INF/views/login3.jsp").forward(request, response);
	}

}