package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.Empresa_detallesDAO;

public class PrincipalEmpresaDetalles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Empresa_detallesDAO enpresaDetalleDAO = context.getBean("empresa_detallesDAOImpl",Empresa_detallesDAO.class);
		
		
		
		context.close();
		
	}

}
