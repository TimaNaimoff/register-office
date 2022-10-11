package dao;

import domain.Person;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PersonDaoTest {
    @Test
    public void findPersons(){
        PersonDao dao=new PersonDao();
        List<Person> list=dao.findPersons();
        list.forEach(p->{
            System.out.println(p.getFirstName());
            System.out.println(p.getClass().getName());
            System.out.println(p.getPassports().size());
        });
    }

}