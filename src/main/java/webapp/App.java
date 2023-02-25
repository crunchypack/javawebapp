package webapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class App extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) {
		
		try {
			String firstName = req.getParameter("firstName");
	        String lastName = req.getParameter("lastName");

	        res.getWriter().append("Full Name: " + firstName + " " + lastName);
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
