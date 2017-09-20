package ajax._04ajaxLoginCheck;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

@WebServlet(name = "jQueryLoginCheckServlet", urlPatterns = "/jQueryLoginCheckServlet")
public class jQueryLoginCheckServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//=============================================
		String username = request.getParameter("usernameText");
		String password = request.getParameter("passwordText");
		System.out.println(username +","+ password);

		HashMap<String, Object> jsonMap = new HashMap<>();
		if ("admin".equals(username) && "1234".equals(password)) {
			jsonMap.put("success", true);
		} else {
			jsonMap.put("msg", "账号密码错误");
		}
	}

}
