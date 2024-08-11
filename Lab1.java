
import java.io.*;
import java.util.*;
import java.servlet.*;
import java.servlet.http.*;

public class Lab1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Lab1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String un = request.getParameter("un");
		String ps = request.getParameter("ps");
		
		if (un.equals(ps) && un != null && ps != null) {
			pw.println("Welcome To Our Website Mr/Miss "+un);
		}
		else {
			/* pw.println("You Are Not Hello User"); */
			response.sendError(404, "Please Enter Correct Username Or Password");
		}

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}