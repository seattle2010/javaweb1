package ajax._10AjaxSearchBaidu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SearchAjaxServlet", urlPatterns = "/SearchAjaxServlet")
public class SearchAjaxServlet extends HttpServlet {
	private String data = "m,ma,mal,mali,maliy,maliya";
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//=============================================
		//String inputText = request.getParameter("inputText");
		//out.println(inputText+"<br>");
		//String msg = null;
		//if (data.contains(inputText)) {
		//	msg = "用户名已经被注册";
		//} else {
		//	msg = "用户名可以被注册";
		//}
		out.println(data);
	}

}
