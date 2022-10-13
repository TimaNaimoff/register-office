package dao;

import edu.javacourse.register.dao.MarriageDao;
import edu.javacourse.register.dao.PersonDao;
import edu.javacourse.register.domain.Person;
import org.junit.Test;

import java.util.List;

public class PersonDaoTest {
    @Test
    public void findPersons(){
        PersonDao dao=new PersonDao();
        List<Person> list=dao.findPersons();
        list.forEach(p->{
            System.out.println("Name: "+p.getFirstName());
            System.out.println("Class for sex "+p.getClass().getName());
            System.out.println("Passports "+p.getPassports());
            System.out.println("Birth-sertificates "+p.getBirthSertificate());
//            if(p instanceof PersonMale){
//                System.out.println("Birth Cer: "+((PersonMale) p).getBithSertificates());
//                System.out.println("Marriage Cert: "+((PersonMale) p).getMarriageSertificates());
//            }
//            else{
//                System.out.println("Birth Cer: "+((PersonFemale) p).getBithSertificates());
//                System.out.println("Marriage Cer: "+((PersonFemale) p).getMarriageSertificates());
//            }
        });
    }

}