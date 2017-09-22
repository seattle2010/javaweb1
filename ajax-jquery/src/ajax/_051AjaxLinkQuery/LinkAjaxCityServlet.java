package ajax._051AjaxLinkQuery;

import ajax._05linkQuery.City;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "LinkAjaxCityServlet", urlPatterns = "/LinkAjaxCityServlet")
public class LinkAjaxCityServlet extends HttpServlet {



	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//=============================================
		 Long pid = Long.valueOf(request.getParameter("pid"));
		List<City> cs = City.getCityByProvinceId(pid);
		StringBuilder sb = new StringBuilder();
		for(City c:cs){
			sb.append("<option value=\'" + c.getId() + "\'>" + c.getName() + "</option>");
		}
		System.out.println(sb);
		//out.write(sb.toString());
		out.write(String.valueOf(sb));
	}

}
