package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;


public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	
	ClienteDAO clienteDAO = context.getBean("clienteDAOImpl",ClienteDAO.class);

	
	//CRUD
	
	
	//add
	Cliente cliente1 = new Cliente();
	clienteDAO.add();
	
	Cliente cliente2 = new Cliente();
	clienteDAO.add(cliente2);
	
//	//del
//	clienteDAO.del();
	
	System.out.println(cliente.toString());
	
//	//findAll
//			List<cliente> clientes = clienteDAO.findAll();
//			
//	
//	for (cliente clientes2 : clientes) {
//		System.out.println(clientes2.toString());
//	}
//			
//			//findOne
//			//clientes cliente = clienteDAO.findOne(1);
////			System.out.println(clientes.toString());
			
	
	context.close();

}
}


