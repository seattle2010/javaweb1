package templateJDBCTemplate.dao.impl;


import templateJDBCTemplate.JDBCTemplate;
import templateJDBCTemplate.dao.IPersonDao;
import templateJDBCTemplate.domain.Person;

import java.util.List;

public class PersonDaoImpl implements IPersonDao {
    @Override
    public void save(Person person) {
        String sql = "INSERT INTO t_student (name,age) VALUES (?,?)";
        JDBCTemplate.update(sql, person.getName(), person.getAge());

    }

    @Override
    public void delete(Long id) {
        String sql = "DELETE FROM t_student WHERE id = ?";
        JDBCTemplate.update(sql, id);

    }

    @Override
    public void update(Long id, Person person) {
        String sql = "UPDATE t_student SET name = ?,age =? WHERE id =?";
        JDBCTemplate.update(sql,person.getName(),person.getAge(),id);

    }

    @Override
    public Person get(Long id) {
        String sql = "SELECT * FROM t_student WHERE id = ?";
        List<Person> querylist = JDBCTemplate.query(sql, id);
        return querylist.size() ==1 ?querylist.get(0):null;
//        if(querylist.size() == 1){
//            return querylist.get(0);
//        }
//        return null;
    }

    @Override
    public List<Person> list() {
        String sql = "SELECT * FROM t_student";
        List<Person> queryall = JDBCTemplate.query(sql);
        return queryall;
    }

//    @Override
//    public PageResult queryPage(Integer currentPage, Integer pageSize) {
//    String baseSql = "SELECT * FROM product LIMIT ?,?";
//
//    List<Product> listData = com.Page.controller.JDBCTemplate.query(baseSql,currentPage-1,pageSize);
//    //----------------
//        String countSql = "SELECT COUNT(*) FROM product";
//        Integer totalCount = JDBCTemplateCount.query(countSql,);
//        return new PageResult();
//    }
}
