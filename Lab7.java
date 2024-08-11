import java.io.*;
import java.util.*;
import java.servlet.*;
import java.servlet.http.*;

public class Lab7 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Lab7() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		Random r = new Random();
		int random = r.nextInt();
		String requestURL=request.getRequestURL().toString(); 
		out.println("<form method='GET' action='" + requestURL + "'>"); 
		out.println("<input type='hidden' name='random' value='" + random + "'/>"); 
		out.println("<input type='submit' value='Click Here'/>"); 
		out.println("</form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}