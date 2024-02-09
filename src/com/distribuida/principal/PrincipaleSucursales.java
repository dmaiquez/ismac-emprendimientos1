package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.EmpresaDAO;
import com.distribuida.dao.SucursalesDAO;
import com.distribuida.entities.Empresa;
import com.distribuida.entities.Sucursales;



public class PrincipaleSucursales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        SucursalesDAO sucursalesDAO = context.getBean("sucursalesDAOImpl", SucursalesDAO.class);

        
        Sucursales sucursalDeAdd = new Sucursales(0,"655196","Empanadas Alonzo");
        sucursalesDAO.add(sucursalDeAdd);		
		System.out.println(sucursalesDAO.findOne(10));

		Sucursales empresaDeUp = new Sucursales(10,"Sucursale 10","Descripcion de la sucursal 10");
		sucursalesDAO.up(empresaDeUp);
		System.out.println(sucursalesDAO.findOne(10));
		
		try { sucursalesDAO.del(10); } catch (Exception e) {e.printStackTrace();	}

		for(Sucursales empresaDeFindAll:sucursalesDAO.findAll()) {
			System.out.println(empresaDeFindAll.toString());
			
		}
//        
//       // Define la cadena de búsqueda
//       String busqueda = "10AM";
//
//        // Usa el método findCustom
//        List<Empresa_detalles> empresaDeFindCustom = empresa_detallesDAO.findCustom(busqueda);
//
//        // Imprime los resultados
//        for (Empresa_detalles item : empresaDeFindCustom) {
//            System.out.println(item);
//        }
	
		
		context.close();
	}

}
