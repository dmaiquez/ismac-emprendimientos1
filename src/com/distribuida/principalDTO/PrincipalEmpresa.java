package com.distribuida.principalDTO;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.distribuida.dto.EmpresaService;
import com.distribuida.entities.Empresa;

public class PrincipalEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");
		EmpresaService empresaService = context.getBean("empresaServiceImpl",EmpresaService.class);

		for(Empresa empresaDeFindAll:empresaService.findAll()) {
			System.out.println(empresaDeFindAll.toString());
			
		}
	}

}
