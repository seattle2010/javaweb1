package ajax._05linkQuery;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LinkByCityServlet", urlPatterns = "/LinkByCityServlet")
public class LinkByCityServlet extends HttpServlet {
	private PrintWriter out;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		out = response.getWriter();
		//=============================================
		//<option value="1">黑龙江</option>
		//<option value="2">吉林</option>
		//<option value="3">辽宁</option>

		//List<City> cs = City.getCityByProvinceId(pid);
		//StringBuilder sb = new StringBuilder(80);
		//sb.append("[");
		////{id:XXX,name:YYY},
		//for(City c:pid){
		//	sb.append("{id:"+c.getId()+",name="+c.getName()+"},");
		//	System.out.println(sb);
		//}
		//sb.deleteCharAt(sb.length() - 1);
		//sb.append("]");
		////out.write(String.valueOf(sb));
		//out.write(sb.toString());


		//List<Province> ps = Province.getAllProvince();
		//StringBuilder sb = new StringBuilder(80);
		//for (Province p : ps) {
		//	sb.append("<option value='" + p.getId() + "'>" + p.getName() + "</option>");
		//	System.out.println(sb);
		//}
		////out.write(String.valueOf(sb));
		//out.write(sb.toString());
	}
		////加载指定省份对应的城市
		//
		//public void getCityById(Long pid){
		//	List<City> cs = City.getCityByProvinceId(pid);
		//	StringBuilder sb = new StringBuilder(80);
		//	for(City c:cs){
		//		sb.append("<option value='"+c.getId()+"'>"+c.getName()+"</option>");
		//	}
		//	out.write(sb.toString());
		//}


}

