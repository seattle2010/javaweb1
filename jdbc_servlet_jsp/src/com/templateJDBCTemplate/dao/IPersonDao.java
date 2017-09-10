package com.templateJDBCTemplate.dao;


import com.templateJDBCTemplate.domain.Person;

import java.util.List;

public interface IPersonDao {
    public void save(Person person);

    public void delete(Long id);

    public void update(Long id, Person person);

    public Person get(Long id);

    public List<Person> list();

    /**
     *
     * @param currentPage 当前第几页
     * @param pageSize  每页最多显示多少条数据
     * @return 封装好结果集和
     */
//    PageResult queryPage(Integer currentPage,Integer pageSize) ;
}
