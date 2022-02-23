package com.ramiro.api.universidaded;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ramiro.api.universidaded.entities.Carrera;
import com.ramiro.api.universidaded.servicios.CarreraDAO;
@Component
public class TestUniversidad implements CommandLineRunner{

	@Autowired
	private CarreraDAO carreraDao;
	
	@Override
	public void run(String... args) throws Exception {
		Carrera ingInformatica = new Carrera(null, "Ingenieria en informática", 63, 4, "Ramiro");
		Carrera LicNutricion = new Carrera(null,"Licenciatura en nutricion", 50, 4, "Ramiro");		
		
		
		
		
		
	}
	
	

}
