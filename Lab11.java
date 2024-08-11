import java.io.*;
import java.util.*;
import java.servlet.*;
import java.servlet.http.*;

public class Lab11 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Lab11() {
        super();
    }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		String un = request.getParameter("un");
		String ps = request.getParameter("ps");
				
		if(un.equals(ps) && un != null && ps != null) {
			pw.println("Hello" + un);
			HttpSession hs = request.getSession();
			hs.setAttribute("session",un);
			
		}
		else {
			response.sendRedirect("http://localhost:8080/LabProgram4/Lab11.html");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}