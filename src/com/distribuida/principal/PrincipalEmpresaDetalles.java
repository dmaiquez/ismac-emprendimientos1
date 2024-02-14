
package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.distribuida.dao.Empresa_detallesDAO;
import com.distribuida.entities.Empresa_detalles;

import java.util.Date;
import java.util.List;

public class PrincipalEmpresaDetalles {
	//is

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Empresa_detallesDAO empresa_detallesDAO = context.getBean("empresa_detallesDAOImpl", Empresa_detallesDAO.class);

        
        Empresa_detalles empresaDeAdd = new Empresa_detalles(0,new Date(),"Comidas",4.0,"Buen servicio","8AM - 5PM","Habiliado","Habilitado");
		empresa_detallesDAO.add(empresaDeAdd);		
		System.out.println(empresa_detallesDAO.findOne(2));

		Empresa_detalles empresaDeUp = new Empresa_detalles(2,new Date(),"Comidas",4.0,"Buen servicio","8AM - 5PM","Habiliado","Habilitado");
		empresa_detallesDAO.up(empresaDeUp);
		System.out.println(empresa_detallesDAO.findOne(2));
		
		try { empresa_detallesDAO.del(1); } catch (Exception e) {e.printStackTrace();	}

		for(Empresa_detalles empresaDeFindAll:empresa_detallesDAO.findAll()) {
			System.out.println(empresaDeFindAll.toString());
			
		}
        
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
