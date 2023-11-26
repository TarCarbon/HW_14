package org.example.entity;

import org.example.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ClientDao {

    private SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();

    //Create
    public void save (Client client) {
        try(Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();
            session.save(client);
            transaction.commit();
        }
    }

    //Read
    public Client findById(int id) {
        try(Session session = sessionFactory.openSession()){
            return session.get(Client.class, id);
        }
    }

    //Update
    public void update(Client client){
        try(Session session = sessionFactory.openSession()) {
            Transaction transaction = session.getTransaction();
            session.update(client);
            transaction.commit();
        }
    }

    public void delete(Client client){
        try(Session session = sessionFactory.openSession()){
            Transaction transaction = session.getTransaction();
            session.delete(client);
            transaction.commit();
        }
    }
}
