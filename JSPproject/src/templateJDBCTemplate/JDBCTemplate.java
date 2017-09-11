package templateJDBCTemplate;



import templateJDBCTemplate.domain.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class JDBCTemplate {
    //DML操作模板
    public static int update(String sql, Object...params) {
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = JdbcUtil.getconn();
            ps = conn.prepareStatement(sql);
            for(int i = 0;i<params.length;i++){
                ps.setObject(i+1,params[i]);
            }
            return ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtil.close(conn,ps,null);
        }
        return 0;
    }

    //DQL操作模板
    public static List<Person> query(String sql, Object... params) {
        List<Person> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            conn = JdbcUtil.getconn();
            ps = conn.prepareStatement(sql);
            for(int i = 0;i<params.length;i++){
                ps.setObject(i + 1, params[i]);

            }
            rs = ps.executeQuery();
            while (rs.next()) {

                Person person = new Person();
                person.setId(rs.getLong("id"));
                person.setName(rs.getString("name"));
                person.setAge(rs.getInt("age"));
                list.add(person);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtil.close(conn,ps,rs);
        }
        return list;
    }

}
