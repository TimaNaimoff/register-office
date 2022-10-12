package edu.javacourse.register.manager;

import dao.MarriageDao;
import domain.MarriageSertificate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rest.MarriageController;
import view.MarriageRequest;
import view.MarriageResponse;

public class MarriageManager {
    private  MarriageDao marriageDao;
    private static final Logger LOGGER = LoggerFactory.
            getLogger(MarriageManager.class);

    public MarriageResponse findMarriageCertificate(MarriageRequest request){
            LOGGER.info("findMarriageCertificate is called");
        MarriageSertificate sertificate=marriageDao.findMarriageCertificate(request);
        return new MarriageResponse();
    }

    public void setMarriageDao(MarriageDao marriageDao) {
        this.marriageDao = marriageDao;
    }
}
