package com.distribuida.principalDTO;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.CategoriaService;
import com.distribuida.entities.Categoria;

public class PrincipalCategoria {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");
		CategoriaService categoriaService = context.getBean("categoriaServiceImpl",CategoriaService.class);

		//CRUD
		
		// add
		//libroService.add(0,"El oso juancho","Lee mas",150,"1th","Español",new Date(),"Trata de un oso","Pasta Dura","ISBN-23",50,"Color","fisico",10.55, 1, 1);
		
		// up
		//libroService.up(79,"El oso rambo","Lee mas",150,"1th","Español",new Date(),"Trata de un oso","Pasta Dura","ISBN-23",50,"Color","fisico",10.55, 1, 1);

		
		// Delete
		//categoriaService.del(79);
		
		//findAll
		List<Categoria> categorias = categoriaService.finAll();
		
		//Impresion
		for(Categoria item : categorias) {
			System.out.println(item.toString());
		}
		
		// findOne
		// Libro libro = libroService.findOne(4);
		// System.out.println(libro.toString());
		
		context.close();
		
	}

}
