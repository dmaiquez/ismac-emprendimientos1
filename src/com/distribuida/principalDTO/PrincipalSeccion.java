package com.distribuida.principalDTO;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.SeccionService;
import com.distribuida.entities.Seccion;

public class PrincipalSeccion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");
		SeccionService seccionService = context.getBean("seccionServiceImpl",SeccionService.class);

		//CRUD
		Seccion seccion1 = new Seccion(0,"Seccion","Descripcion");
		seccionService.add(1, "secc", "descripcion");
		System.out.println(seccionService.findOne(10));
		
		
		Seccion seccion3 = new Seccion(10,"Seccion11","Descripcion11");
		seccionService.up(1, "secc", "descripcion");
		System.out.println(seccionService.findOne(10));
				
		try { seccionService.del(10); } catch (Exception e) {e.printStackTrace();	}
	
		
		for(Seccion seccion:seccionService.findAll()) {
			System.out.println(seccion.toString());
//			
		}
		
		
//		// add
//		//libroService.add(0,"El oso juancho","Lee mas",150,"1th","Español",new Date(),"Trata de un oso","Pasta Dura","ISBN-23",50,"Color","fisico",10.55, 1, 1);
//		
//		// up
//		//libroService.up(79,"El oso rambo","Lee mas",150,"1th","Español",new Date(),"Trata de un oso","Pasta Dura","ISBN-23",50,"Color","fisico",10.55, 1, 1);
//
//		
//		// Delete
//		//seccionService.del(79);
//		
//		//findAll
//		List<Seccion> secciones = seccionService.findAll();
//		
//		//Impresion
//		for(Seccion item : secciones) {
//			System.out.println(item.toString());
//		}
//		
//		// findOne
//		// Libro libro = libroService.findOne(4);
//		// System.out.println(libro.toString());
		
		context.close();
	}

}
