import java.io.*;
import java.util.*;
import java.servlet.*;
import java.servlet.http.*;

public class Lab5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Lab5() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String s1 = "Hello Guys";
		if (s1.length() == 5) {
			pw.println("String Is Equal To 5");
		}
		else{
			response.sendError(404, "String Is  Greathe Than 5");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}