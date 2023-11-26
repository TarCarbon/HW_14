package org.example.entity;

import org.example.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PlanetDao {
    private SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();

    //Create
    public void save (Planet planet) {
        try(Session session = sessionFactory.openSession()){
            Transaction transaction = session.getTransaction();
            session.persist(planet);
            transaction.commit();
        }
    }

    //Read
    public Planet findById(String id) {
        try(Session session = sessionFactory.openSession()) {
            return session.get(Planet.class, id);
        }
    }

    //Update
    public void update(Planet planet){
        try(Session session = sessionFactory.openSession()){
            Transaction transaction = session.getTransaction();
            session.update(planet);
            transaction.commit();
        }
    }

    //Delete
    public void delete(Planet planet){
        try(Session session = sessionFactory.openSession()){
            Transaction transaction = session.getTransaction();
            session.delete(planet);
            transaction.commit();
        }
    }

}
