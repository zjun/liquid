package zjun.liquid.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

import zjun.liquid.utils.HibernateUtil;

public abstract class BaseDao<T> implements IDao<T> {

	@Override
	public void create(T t) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(t);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void update(T t) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(t);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void delete(T t) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.delete(t);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void deleteById(Serializable id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		T t = (T) session.get(getObjectClass(), id);
		session.beginTransaction();
		session.delete(t);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public T getById(Serializable id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		T t = (T) session.get(getObjectClass(), id);
		session.close();
		return t;
	}

	@Override
	public List<T> list() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<T> list = (List<T>) session.createCriteria(getObjectClass())
				.list();
		session.close();
		return list;
	}

	abstract protected Class getObjectClass();

}
