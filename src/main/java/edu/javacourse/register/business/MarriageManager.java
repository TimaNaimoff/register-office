package edu.javacourse.register.business;

import edu.javacourse.register.dao.MarriageDao;
import edu.javacourse.register.dao.PersonDao;
import edu.javacourse.register.domain.MarriageSertificate;
import edu.javacourse.register.domain.Person;
import edu.javacourse.register.domain.PersonFemale;
import edu.javacourse.register.domain.PersonMale;
import edu.javacourse.register.view.MarriageResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;


@Service("marriageService")
public class MarriageManager {

    private static final Logger LOGGER = LoggerFactory.
            getLogger(MarriageManager.class);

    @Autowired
    private MarriageDao marriageDao;
    @Autowired
    private PersonDao personDao;

    @Transactional
    public MarriageResponse findMarriageCertificate(){
            LOGGER.info("findMarriageCertificate is called");
        //List<MarriageSertificate> sertificate=marriageDao.findMarriageCertificate();
        personDao.addPerson(getPerson( 1));
        personDao.addPerson(getPerson( 2));
        MarriageSertificate mrs=getMarriageSertificate();
        marriageDao.saveAndFlush(mrs);
//        marriageDao.findAll();
//        marriageDao.findById(1L);
          List<MarriageSertificate>list=marriageDao.findByNumber("12345");
          list.forEach(m->LOGGER.info("MC:{}",m.getMarriageCertificateId()));
          LOGGER.info("-------->");
          List<MarriageSertificate>list2=marriageDao.findByNumb("12345");
          list2.forEach(m->LOGGER.info("MC:{}",m.getMarriageCertificateId()));

          List<MarriageSertificate>list3=marriageDao.findSomething("908");
          list3.forEach(m->LOGGER.info("MC:{}",m.getMarriageCertificateId()));
          LOGGER.info("-------->");
          return new MarriageResponse();
    }

    private MarriageSertificate getMarriageSertificate(){
        MarriageSertificate sertificate=new MarriageSertificate();
        sertificate.setIssueDate(LocalDate.now());
        sertificate.setNumber("908");
        sertificate.setActive(true);
        List<Person>persons=personDao.findPersons();

        persons.forEach(p->{
           if (p instanceof PersonMale) sertificate.setHusband((PersonMale) p);
           else sertificate.setWife((PersonFemale) p);
        });
        return sertificate;

    }
    private Person getPerson(int sex) {
        Person m=sex==1?new PersonMale() : new PersonFemale();
        m.setFirstName("Timofey "+sex);
        m.setLastName("Balduin"+sex);
        m.setPatronymic("Kuchkunofka"+sex);
        m.setDateOfBith(LocalDate.of(1991,5,12));
        return m;
    }


}
