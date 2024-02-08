package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.distribuida.dao.PedidoDAO;
import com.distribuida.entities.Pedido;


public class PrincipalPedido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
				PedidoDAO pedidoDAO = context.getBean("pedidoDAOImpl",PedidoDAO.class);
						
				//Cadena de busqueda
				String busqueda = "P003";
				
				//Metodofin all
				List<Pedido> pedido = pedidoDAO.findAll(busqueda);
				
				//Imprime resultados
				for(Pedido item : pedido){
				System.out.println(item);
				
				}
				context.close();

	}

}
