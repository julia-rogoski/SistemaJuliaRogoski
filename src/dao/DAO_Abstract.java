package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class DAO_Abstract {
    Session session;
    public DAO_Abstract() {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    session = sessionFactory.openSession();
}

public abstract void insert(Object objeto);
public abstract void update(Object objeto);
public abstract void delete(Object objeto);
public abstract Object list(int codigo);
public abstract Object listAll();
}