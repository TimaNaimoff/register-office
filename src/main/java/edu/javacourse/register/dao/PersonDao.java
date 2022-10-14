package edu.javacourse.register.dao;

import edu.javacourse.register.domain.Person;

import javax.persistence.*;
import java.util.List;

public class PersonDao {
        @PersistenceContext
        private EntityManager entityManager;


        public List<Person> findPersons(){
            Query namedQuery=entityManager.createNamedQuery("Person.findPersons");
            namedQuery.setParameter("personId",1L);
            return namedQuery.getResultList();

        }
    }

