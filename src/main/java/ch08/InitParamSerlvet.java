package ch08;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitParamSerlvet
 */
@WebServlet(		 
		urlPatterns = { 
				"/ch08/Init", 
				"/ch08/Init2"
		}, 
		initParams = { 
				@WebInitParam(name = "email", value = "admin@web.com", description = "관리자 이메일 주소"), 
				@WebInitParam(name = "tel", value = "010-2345-6789", description = "관리자 전화번호")
		})
public class InitParamSerlvet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = getInitParameter("email");
		String tel = getInitParameter("tel");
		System.out.println(email);
		System.out.println(tel);
	}

}
