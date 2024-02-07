package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.distribuida.entities.FormaPago;


@Repository
public class FormaPagoDAOImpl implements FormaPagoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<FormaPago> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Formaspago",FormaPago.class).getResultList();
	}

	@Override
	@Transactional
	public FormaPago findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(FormaPago.class, id);
	}

	@Override
	@Transactional
	public void add(FormaPago formaPago) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(formaPago);
	}

	@Override
	@Transactional
	public void up(FormaPago formaPago) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(formaPago);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));
	}
	@Override
	public List<FormaPago> findAll(String busqueda) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query<FormaPago> query = session.createQuery("SELECT FROM FormaPago au WHERE au.idFormaPago =: idFormaPago"
				+ "au.FormaPago LIKE : busqueda"
				+ "au.Descripcion LIKE : busqueda", FormaPago.class);
	
		query.setParameter("busqueda", "%"+busqueda+"%");
				return query.getResultList();}
}
