package ch10;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FilterTest
 */
@WebServlet("/ch10/filterTest")
public class FilterTest extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String msg = request.getParameter("msg");

		response.setContentType("text/html; charset=uft-8");
		printWriter out = response.getWriter();
		out.print("<h1>a: " + filtertest + "</h1>" );
		out.print("<h1>b: " + b + "</h1>" );
		
	}
}

