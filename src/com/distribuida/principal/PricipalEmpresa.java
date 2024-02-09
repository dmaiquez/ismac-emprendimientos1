package com.distribuida.principal;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.EmpresaDAO;
import com.distribuida.dao.Empresa_detallesDAO;
import com.distribuida.entities.Empresa;
import com.distribuida.entities.Empresa_detalles;



public class PricipalEmpresa {

	 public static void main(String[] args) {
	        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	        EmpresaDAO empresaDAO = context.getBean("empresaDAOImpl", EmpresaDAO.class);

	        
	        Empresa empresaDeAdd = new Empresa(0,"655196","Empanadas Alonzo","Luis Pozo","Miguel Q.","02210659720","empanadasa2@empanadasalonzo.em","Tumbaco, Sim");
			empresaDAO.add(empresaDeAdd);		
			System.out.println(empresaDAO.findOne(9));

			Empresa empresaDeUp = new Empresa(6,"655196","Empanadas Alonzo","Luis Pozo","Miguel Q.","02210659720","empanadasa2@empanadasalonzo.em","Tumbaco, Sim");
			empresaDAO.up(empresaDeUp);
			System.out.println(empresaDAO.findOne(6));
			
			try { empresaDAO.del(9); } catch (Exception e) {e.printStackTrace();	}

			for(Empresa empresaDeFindAll:empresaDAO.findAll()) {
				System.out.println(empresaDeFindAll.toString());
				
			}
//	        
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
