package dao;

import domain.MarriageSertificate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import view.MarriageRequest;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class MarriageDao {
     private static final Logger LOGGER = LoggerFactory.
             getLogger(MarriageDao.class);
     private EntityManager entityManager;
    //MarriageRequest marriageRequest
     public MarriageDao(){
         EntityManagerFactory factory= Persistence.createEntityManagerFactory("persistence");
         entityManager=factory.createEntityManager();

     }
     public List<MarriageSertificate> findMarriageCertificate() {
         LOGGER.info("findMarriageCertificate is called: ");
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
