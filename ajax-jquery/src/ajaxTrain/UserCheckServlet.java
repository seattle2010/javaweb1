package ajaxTrain;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "UserCheckServlet", urlPatterns = "/UserCheckServlet")
public class UserCheckServlet extends HttpServlet {
	private List<String> userList= Arrays.asList("tom","jack","rose");

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//=============================================
		String username = request.getParameter("username");
		String msg = null;
		if (userList.contains(username)) {
			msg = "此用户名已经存在,请更换用户名";
		} else {
			msg = "你的名字起得真好";
		}
		out.write(msg);
	}

}
