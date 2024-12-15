/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author vodka
 */
import java.awt.List;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class DAO_Abstract {
    
    public Session session;
    public DAO_Abstract() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
    }
    
    public abstract void insert(Object object);
    public abstract void update(Object object);
    public abstract void delete(Object object);
    public abstract Object list(int codigo);
    public abstract ArrayList listAll();
}
