import java.io.*;
import java.util.*;
import java.servlet.*;
import java.servlet.http.*;

public class Lab9 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Lab9() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String un = request.getParameter("un");
		Cookie ck = new Cookie("kash",un);
		ck.setMaxAge(0);
		response.addCookie(ck);

		if(ck != null) {
			pw.println("Welcome Back "+ck.getValue());
			
		}
		else {
			pw.println("Welcome "+ck.getValue());
		}

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}