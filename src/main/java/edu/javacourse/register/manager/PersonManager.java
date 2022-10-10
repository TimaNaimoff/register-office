package edu.javacourse.register.manager;

import edu.javacourse.register.domain.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.Serializable;
import java.util.List;


public class PersonManager {
    public static void main(String[] args) {
        //sessionExample();
        jpaExample();
    }

    private static void jpaExample() {
        EntityManagerFactory enf= Persistence.createEntityManagerFactory("persistence");
        EntityManager en=enf.createEntityManager();
        en.getTransaction().begin();
        Person p=new Person();
        p.setFirstName("Alexian");
        p.setLastName("Parnaian");
        en.persist(p);
        System.out.println(p.getPerson_id());
        en.getTransaction().commit();
        en.close();
        en=enf.createEntityManager();
        List list=en.createQuery("FROM Person").getResultList();
        list.forEach(ps-> System.out.println(ps));
        en.close();
    }

    private static void sessionExample() {
        SessionFactory sessionFactory=buildSessionFactory();
        Session s=sessionFactory.openSession();
        s.getTransaction().begin();
        Person p=new Person();
        p.setFirstName("Kozus");
        p.setLastName("Balfor");
        Long id=(Long)s.save(p);
        System.out.println(id);
        s.getTransaction().commit();
        s.close();
        s= sessionFactory.openSession();
        Person person=s.get(Person.class,id);
        System.out.println(person);
        s.close();

        s= sessionFactory.openSession();
        List<Person> lists=s.createQuery("FROM Person",Person.class).list();
        lists.forEach(pt -> System.out.println(pt));
        s.close();
    }

    private static SessionFactory buildSessionFactory(){
        try{
            StandardServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().
                    configure("hibernate.cfg.xml").build();
            Metadata metadata=new MetadataSources(serviceRegistry).getMetadataBuilder().build();
            return metadata.getSessionFactoryBuilder().build();
         }catch(Exception ex){
            System.err.println("Initial SessionFactory creation failed."+ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
}
