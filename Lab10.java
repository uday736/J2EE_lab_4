import java.io.*;
import java.util.*;
import java.servlet.*;
import java.servlet.http.*;

public class Lab10 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Lab10() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		HttpSession hs = request.getSession();
		hs.setAttribute("kashyap", "session11");
		
		if (hs != null) {
			pw.println("Welcome back");
		}
		else {
			pw.println("Welcome");
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}