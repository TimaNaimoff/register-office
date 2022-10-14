package edu.javacourse.register.business;

import edu.javacourse.register.dao.MarriageDao;
import edu.javacourse.register.dao.PersonDao;
import edu.javacourse.register.domain.MarriageSertificate;
import edu.javacourse.register.view.MarriageResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("marriageService")
public class MarriageManager {

    private static final Logger LOGGER = LoggerFactory.
            getLogger(MarriageManager.class);

    @Autowired
    private MarriageDao marriageDao;
    @Autowired
    private PersonDao personDao;


    public MarriageResponse findMarriageCertificate(){
            LOGGER.info("findMarriageCertificate is called");
        List<MarriageSertificate> sertificate=marriageDao.findMarriageCertificate();
        personDao.findPersons();
        return new MarriageResponse();
    }


}
