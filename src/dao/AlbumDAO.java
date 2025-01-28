/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Album;
import java.awt.List;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author vodka
 */
public class AlbumDAO extends DAO_Abstract{
    
    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.beginTransaction().commit();
    } 

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.beginTransaction().commit();   
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.beginTransaction().commit();
    }

    @Override
    public Object list(int id) { // id é o parametro da list
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Album.class); // criteria eh uma classe do hibernate feita para consultas - select * from usuarios
        criteria.add (Restrictions.eq("idalbum", id)); //o "idvendas" vem do banco de dados. restrictions serve para restringir as pesquisas, e com o "eq" significa "equals" reduzindo mais ainda a pesquisa
        ArrayList lista = (ArrayList) criteria.list();
        session.getTransaction().commit();
        return lista.get(0);    
    }

    @Override
    public ArrayList listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Album.class);
        ArrayList lista = (ArrayList) criteria.list();
        session.getTransaction().commit();
        return lista;
    }
}
