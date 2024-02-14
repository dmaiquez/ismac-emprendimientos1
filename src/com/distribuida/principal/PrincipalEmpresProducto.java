package com.distribuida.principal;


import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.distribuida.dao.Empresa_productoDAO;
import com.distribuida.entities.Empresa_producto;


public class PrincipalEmpresProducto {

	public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Empresa_productoDAO empresa_productoDAO = context.getBean("empresa_productoDAOImpl", Empresa_productoDAO.class);

        
        Empresa_producto empresaDeAdd = new  Empresa_producto(0,"Producto B","Descripción del Producto B");
        empresa_productoDAO.add(empresaDeAdd);		
		System.out.println(empresa_productoDAO.findOne(46));

		 Empresa_producto empresaDeUp = new  Empresa_producto(46,"Producto B","Descripción del Producto B a B");
		 empresa_productoDAO.up(empresaDeUp);
		System.out.println(empresa_productoDAO.findOne(46));
		
		try { empresa_productoDAO.del(46); } catch (Exception e) {e.printStackTrace();	}

		for( Empresa_producto empresaDeFindAll:empresa_productoDAO.findAll()) {
			System.out.println(empresaDeFindAll.toString());
			
		}
        
//       // Define la cadena de búsqueda
//       String busqueda = "10AM";
//
//        // Usa el método findCustom
//        List<Empresa_producto> empresaDeFindCustom = empresa_productoDAO.findCustom(busqueda);
//
//        // Imprime los resultados
//        for (Empresa_producto item : empresaDeFindCustom) {
//            System.out.println(item);
//        }

        context.close();
    }
}
