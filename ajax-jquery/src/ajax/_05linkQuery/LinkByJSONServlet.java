package ajax._05linkQuery;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "LinkByJSONServlet", urlPatterns = "/LinkByJSONServlet")
public class LinkByJSONServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //=============================================
    //<option value="1">黑龙江</option>
    //<option value="2">吉林</option>
    //<option value="3">辽宁</option>
        List<Province> ps = Province.getAllProvince();
        StringBuilder sb = new StringBuilder(80);
        sb.append("[");
        //{id:XXX,name:YYY},
        for(Province p:ps){
            sb.append("{id:"+p.getId()+",name="+p.getName()+"},");
            System.out.println(sb); 
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        //out.write(String.valueOf(sb));
        out.write(sb.toString());
    }



}
