package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Pedido;
import com.distribuida.entities.Perfil_empresa;

@Repository
public class PedidoDAOImpl implements PedidoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Pedido> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Pedido",Pedido.class).getResultList();
	}

	@Override
	@Transactional
	public Pedido findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Pedido.class, id);
	}

	@Override
	@Transactional
	public void add(Pedido pedido) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(pedido);
	}

	@Override
	@Transactional
	public void up(Pedido pedido) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(pedido);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));
	}
	@Override
	public List<Pedido> findAll(String busqueda) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query<Pedido> query = session.createQuery("SELECT FROM Pedido au WHERE au.idPedido =: idPedido"
				+ "au.numeroPedido LIKE : busqueda"
				+ "au.fechaPedido LIKE : busqueda"
				+ "au.confirmacionPedido LIKE : busqueda", Pedido.class);
	
		query.setParameter("busqueda", "%"+busqueda+"%");
				return query.getResultList();}
}
