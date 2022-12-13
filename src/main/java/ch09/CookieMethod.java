package ch09;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieMethod
 */
@WebServlet("/CookieMethod")
public class CookieMethod extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		String data = "";
		for (Cookie c: cookies) {
			data = "Name: " + c.getName() + ", Value" + c.getValue();
			data += ", path" + c.getPath() + ", MaxAge" + c.getMaxAge();
			data += ", Domain:" + c.getDomain();			
			}
		
		response.setContentType("text/html; charset=utf-8");
		
		
	}

}
