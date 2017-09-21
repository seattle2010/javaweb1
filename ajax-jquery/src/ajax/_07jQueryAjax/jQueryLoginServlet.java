package ajax._07jQueryAjax;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "jQueryLoginServlet", urlPatterns = "/jQueryLoginServlet")
public class jQueryLoginServlet extends HttpServlet {


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//=============================================
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username + "," + password);
		////Map<String, Object> jsonMap = new Map<>();
		if ("admin".equals(username) && "1234".equals(password)) {
			out.write("success");
//			//jsonMap.put("success", true);
		} else {
			out.write("用户名或者密码不正确");
//			//jsonMap.put("fail", false);


		}
	}

}
