package edu.javacourse.register.dao;

import edu.javacourse.register.domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class PersonDao {
        private EntityManager entityManager;

        public PersonDao(){
            EntityManagerFactory factory= Persistence.createEntityManagerFactory("persistence");
            entityManager=factory.createEntityManager();

        }
        public List<Person> findPersons(){
            Query namedQuery=entityManager.createNamedQuery("Person.findPersons");
            namedQuery.setParameter("personId",1L);
            return namedQuery.getResultList();

        }
    }

