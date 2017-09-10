package com.templateJDBCTemplate.daotest;


import com.templateJDBCTemplate.dao.IPersonDao;
import com.templateJDBCTemplate.dao.impl.PersonDaoImpl;
import com.templateJDBCTemplate.domain.Person;
import org.junit.Test;

import java.util.List;

public class IPersonDaoTest {
    IPersonDao dao = new PersonDaoImpl();
    @Test
    public void save() throws Exception {
        Person person = new Person();
        person.setName("max1");
        person.setAge(12);
        dao.save(person);

    }

    @Test
    public void delete() throws Exception {
        dao.delete(5L);
    }

    @Test
    public void update() throws Exception {
        Person person = new Person();
        Long id = 3L;
        person.setName("min");
        person.setAge(19);
        dao.update(id,person);
    }

    @Test
    public void get() throws Exception {
        Person person = dao.get(1L);
        System.out.println(person);

    }

    @Test
    public void list() throws Exception {
        List<Person> list = dao.list();
        for(Person ele:list){
            System.out.println(ele);
        }
    }

}
