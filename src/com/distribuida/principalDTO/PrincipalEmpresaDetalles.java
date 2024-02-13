package com.distribuida.principalDTO;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.distribuida.dto.Empresa_detallesService;
import com.distribuida.entities.Empresa_detalles;

public class PrincipalEmpresaDetalles {

	 public static void main(String[] args) {
	        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	        Empresa_detallesService empresa_detallesService = context.getBean("empresa_detallesServiceImpl", Empresa_detallesService.class);

	        
	  
//	        empresa_detallesService.add(0, null, "Comidas", 4.0, "Buen servicio","8AM - 5PM","Habiliado","Habilitado", 0, 0);
//			System.out.println(empresa_detallesService.finOne(2));
//
//
//			empresa_detallesService.up(2, null, "Comidas", 4.0, "Buen servicio","10AM - 5PM","Habiliado","Habilitado", 0, 0);
//			System.out.println(empresa_detallesService.finOne(2));
			
			try { empresa_detallesService.del(1); } catch (Exception e) {e.printStackTrace();	}

			for(Empresa_detalles empresaDeFindAll:empresa_detallesService.finAll()) {
				System.out.println(empresaDeFindAll.toString());
				
			}
	        
//	       // Define la cadena de búsqueda
//	       String busqueda = "10AM";
	//
//	        // Usa el método findCustom
//	        List<Empresa_detalles> empresaDeFindCustom = empresa_detallesDAO.findCustom(busqueda);
	//
//	        // Imprime los resultados
//	        for (Empresa_detalles item : empresaDeFindCustom) {
//	            System.out.println(item);
//	        }

	        context.close();
	    }
	}

