package dao;

import domain.MarriageSertificate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import view.MarriageRequest;
import javax.persistence.EntityManager;

public class MarriageDao {
     private static final Logger LOGGER = LoggerFactory.
             getLogger(MarriageDao.class);
     private EntityManager entityManager;
     private String test;

     public MarriageSertificate findMarriageCertificate(MarriageRequest marriageRequest){
         LOGGER.info("findMarriageCertificate is called: {}",test);
         new MarriageSertificate();
         return null;
     }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String text) {
        this.test = test;
    }
}
