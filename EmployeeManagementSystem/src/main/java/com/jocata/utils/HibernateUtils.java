package com.jocata.utils;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public class HibernateUtils {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession()
	{
		Session session=null;
		try {
			session=sessionFactory.openSession();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return session;
	}
	private void closeSession(Session currentSession)
	{
		if(currentSession!=null)
		{
			currentSession.close();
		}
	}
	public <T> Serializable save(T entity)
	{
		Session currentSession=getSession();
		Serializable newPKID=null;
		try {
			currentSession.beginTransaction();
			newPKID=currentSession.save(entity);
			currentSession.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			closeSession(currentSession);
		}
		return newPKID;
	}
	public <T> void update(T entity)
	{
		Session currentSession=getSession();
		try {
			currentSession.beginTransaction();
			currentSession.update(entity);
			currentSession.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			closeSession(currentSession);
		}
	}
	public <T> void delete(T entity)
	{
		Session currentSession=getSession();
		try {
			currentSession.beginTransaction();
			currentSession.delete(entity);
			currentSession.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			closeSession(currentSession);
		}
	}
	@SuppressWarnings("unchecked")
	public <T> void deleteByHql(String hql)
	{
		Session currentSession=getSession();
		try {
			currentSession.beginTransaction();
			Query<T> query=currentSession.createQuery(hql);
			query.executeUpdate();
			currentSession.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			closeSession(currentSession);
		}
	}
    @SuppressWarnings("unchecked")
	public <T> List<T> loadEntityByHql(String hql)
    {
    	Session currentSession=getSession();
    	try {
    		Query<T> query=currentSession.createQuery(hql);
    		return query.list();
			
		} catch (Exception e) {
			e.printStackTrace();
			closeSession(currentSession);
		}
    	return null;
    }
	public <T> T getEntityById(Class<T> T, Serializable pkId) {
		Session currentSession = getSession();
		try {

			return currentSession.get(T, pkId);

		}catch(Exception exception) {
			exception.printStackTrace();
			closeSession(currentSession);
		}
		return null;
	}
	public <T> T getEntityByHql(String hql) {
		Session currentSession = getSession();
		try {

			@SuppressWarnings({ "unchecked" })
			Query<T> query = currentSession.createQuery(hql);
			List<T> myList = query.list();

			if(myList != null && myList.size() >0)
				return myList.get(0);

		}catch(Exception exception) {
			exception.printStackTrace();
			closeSession(currentSession);
		}
		return null;
	}


    

}
