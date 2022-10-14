package edu.javacourse.register.rest;

import edu.javacourse.register.business.MarriageManager;
import edu.javacourse.register.view.MarriageRequest;
import edu.javacourse.register.view.MarriageResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service("controller")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MarriageController {
    private static final Logger LOGGER = LoggerFactory.
            getLogger(MarriageController.class);
    @Autowired
    @Qualifier("marriageService")
    private MarriageManager marriageManager;

    public MarriageResponse findMarriageCertificate(MarriageRequest marriageRequest){
        LOGGER.info("findMarriageCertificate called");

        return marriageManager.findMarriageCertificate();//marriageRequest);
    }

    public void setMarriageManager(MarriageManager marriageManager) {
        this.marriageManager = marriageManager;
    }
}
