package edu.javacourse.register.dao;

import edu.javacourse.register.domain.MarriageSertificate;
import edu.javacourse.register.domain.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;


@Component
public class MarriageDao {
     private static final Logger LOGGER = LoggerFactory.
             getLogger(MarriageDao.class);

     @PersistenceContext
     private EntityManager entityManager;
     //MarriageRequest marriageRequest
     @Value("${test.value}")
     private String text;

     public List<MarriageSertificate> findMarriageCertificate() {
         LOGGER.info("findMarriageCertificate is called: "+text);
          Query namedQuery=entityManager.createNamedQuery("MarriageSertificate.findMarriageCertificate");
          namedQuery.setParameter("certificate_status",true);
          return namedQuery.getResultList();
     }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


}
