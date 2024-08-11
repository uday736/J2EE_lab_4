import java.io.*;
import java.util.*;
import java.servlet.*;
import java.servlet.http.*;

public class Lab6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Lab6() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		Random r = new Random();
		double random = r.nextDouble();
		String url = request.getRequestURL().toString();
		String url2;
		url2 = url + "?rewrite" + random;
		pw.println(url);
		pw.println(url2);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}