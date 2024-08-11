import java.io.*;
import java.util.*;
import java.servlet.*;
import java.servlet.http.*;

public class Lab3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Lab3() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println(request.getHeader("user-agent")); 
		String h = request.getHeader("user-agent");
		if (h.contains("MSIE")) {
			pw.println("<br>Browser Use Is Internet Explorer");
		}
		else {
			pw.println("<br>Browser Use Is Not Internet Explorer");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}