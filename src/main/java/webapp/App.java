package webapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class App extends HttpServlet{
	
	protected void processRequest(HttpServletRequest req, HttpServletResponse res) {
		
		res.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = res.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletCalculo</title>");            
            out.println("</head>");
            out.println("<body>");
            
            double numOne = Double.parseDouble(req.getParameter("left"));
            double numTwo = Double.parseDouble(req.getParameter("right"));
            
            Calculator calc = new Calculator();
            double result = calc.addition(numOne, numTwo);
            
            RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
            req.setAttribute("sum", result);
            rd.forward(req, res);
            
            out.println("</body>");
            out.println("</html>");
		} catch (ServletException | IOException e) {
			Logger.getAnonymousLogger().log(Level.WARNING, e.getMessage());
		}
	}

	 @Override
	    protected void doGet(HttpServletRequest request,
	                        HttpServletResponse response)
	        throws ServletException, IOException
	    {
	        processRequest(request, response);
	    }
	    @Override
	    protected void doPost(HttpServletRequest request,
	                        HttpServletResponse response)
	        throws ServletException, IOException
	    {
	        processRequest(request, response);
	    }
	    @Override
	    public String getServletInfo()
	    {
	        return "Short description";
	    }

}
