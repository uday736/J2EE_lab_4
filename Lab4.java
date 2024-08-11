import java.io.*;
import java.util.*;
import java.servlet.*;
import java.servlet.http.*;

public class Lab4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Lab4() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println(request.getHeader("user-agent")); 
		String h = request.getHeader("user-agent");
		if (h.contains("MSIE")) {
			pw.println("Browser Use Is Internet Explorer");
		}
		else {
			response.sendRedirect("https://www.google.com/");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}