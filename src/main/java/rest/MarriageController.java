package rest;

import edu.javacourse.register.manager.MarriageManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import view.MarriageRequest;
import view.MarriageResponse;

public class MarriageController {
    private static final Logger LOGGER = LoggerFactory.
            getLogger(MarriageController.class);
    private MarriageManager marriageManager;

    public MarriageResponse findMarriageCertificate(MarriageRequest marriageRequest){
        LOGGER.info("findMarriageCertificate called");

        return marriageManager.findMarriageCertificate();//marriageRequest);
    }

    public void setMarriageManager(MarriageManager marriageManager) {
        this.marriageManager = marriageManager;
    }
}
