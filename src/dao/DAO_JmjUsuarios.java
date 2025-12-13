/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.JmjUsuarios;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u09208193110
 */
public class DAO_JmjUsuarios extends DAO_Abstract{

    @Override
    public void insert(Object objeto) {																																										
        session.beginTransaction();
        session.save(objeto);
        session.getTransaction().commit();

    }

    @Override
    public void update(Object objeto) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(objeto);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object objeto) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(objeto);
        session.getTransaction().commit();    }

    @Override
    public Object list(int codigo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JmjUsuarios.class);
        criteria.add(Restrictions.eq("jmjIdUsuarios", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();    
        return lista;
    }
    
    public Object listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JmjUsuarios.class);
        criteria.add(Restrictions.like("jmjNome", "%" +  nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();    
        return lista;
    }
    
    public Object listCpf(String cpf) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JmjUsuarios.class);
        criteria.add(Restrictions.eq("jmjCpf", cpf));
        List lista = criteria.list();
        session.getTransaction().commit();    
        return lista;
    }
    
    public Object listNomeCpf(String nome, String cpf) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JmjUsuarios.class);
        criteria.add(Restrictions.eq("jmjCpf", cpf));
        criteria.add(Restrictions.like("jmjNome", "%" +  nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();    
        return lista;
    }

    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JmjUsuarios.class);
        List lista = criteria.list();
        session.getTransaction().commit();    
        return lista;
    }
    
    public static void main(String[] args) {
        DAO_JmjUsuarios dAO_JmjUsuarios = new DAO_JmjUsuarios();
        dAO_JmjUsuarios.listAll();
        System.out.println("Deu certo!");
    }
    
}
