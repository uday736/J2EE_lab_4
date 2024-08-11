import java.io.*;
import java.util.*;
import java.servlet.*;
import java.servlet.http.*;

public class Lab8 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Lab8() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		PrintWriter pw = response.getWriter();
		Cookie ck = new Cookie("kashyap", "firstcookie");
		ck.setMaxAge(39000);
		if(ck == null) {
			response.addCookie(ck);
		}
		else {
			pw.println(ck.getName());
			pw.println(ck.getValue());
			pw.println("Have Cookie");

		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}