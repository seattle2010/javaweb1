package ajax._051AjaxLinkQuery;

import ajax._05linkQuery.Province;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "JSONLinkAjaxServlet", urlPatterns = "/JSONLinkAjaxServlet")
public class JSONLinkAjaxServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//=============================================
//加载所有省份
//		[
// {id:1,name:'黑龙江'}，
// {id:1,name:'吉林'}，
// {id:1,name:'辽宁'}
// ]
		//拿到每个省份的集合
		List<Province> ps = Province.getAllProvince();
		StringBuilder sb = new StringBuilder(80);
		sb.append("[");
		for(Province p:ps){
		    System.out.println(p);
			sb.append("{id:" + p.getId() + ",name:'" + p.getName()+"'}，");
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append("]");

		out.write(sb.toString());
	}



}
