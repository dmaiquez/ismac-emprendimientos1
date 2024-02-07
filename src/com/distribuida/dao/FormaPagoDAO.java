package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.FormaPago;

public interface FormaPagoDAO {

	public List<FormaPago> findAll();
	
	public FormaPago findOne(int id);
	
	public void add(FormaPago fomaPago);
	
	public void up(FormaPago fomaPago);
	
	public void del(int id);

	List<FormaPago> findAll(String busqueda);
}
