package com.ramiro.api.universidaded;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ramiro.api.universidaded.entities.Alumno;
import com.ramiro.api.universidaded.entities.Carrera;
import com.ramiro.api.universidaded.entities.Direccion;
import com.ramiro.api.universidaded.entities.Persona;
import com.ramiro.api.universidaded.servicios.AlumnoDAO;
import com.ramiro.api.universidaded.servicios.CarreraDAO;
@Component
public class TestUniversidad implements CommandLineRunner{

	@Autowired
	private CarreraDAO carreraDao;
	@Autowired
	private AlumnoDAO alumnoDao;
	
	@Override
	public void run(String... args) throws Exception {
		Carrera ingInformatica = new Carrera(null, "Ingenieria en informática", 63, 4, "Ramiro");
		Carrera LicNutricion = new Carrera(null,"Licenciatura en nutricion", 50, 4, "Ramiro");		
		Direccion direccionPam = new Direccion("Ostra","3","15670","3","2","CDMX");
		Persona pamela = new Alumno(null,"Pamela","Valenzuela","5345346","Ramiro",direccionPam);
		
		Direccion direccionAxel = new Direccion("Ostion","3","4564","3","2","CDMX");
		Persona axel = new Alumno(null,"Axel","Alvarez","5656","Ramiro",direccionAxel);
		Persona jessica = new Alumno(null,"Jessica","Alvarez","546098","Ramiro",direccionAxel);
		Carrera carrera=null;
		
	
		Optional<Carrera> carrera1= carreraDao.buscarPorId(1L);
		if(carrera1.isPresent()) {
			carrera=carrera1.get();
			System.out.println(carrera.toString());
		}else {
			System.out.println("La carrera no se encuentra");
		}
		
//		carrera.setNombreCarrera("Ingenieria en computacion");
//		carrera.setCantidadMaterias(50);
//		carreraDao.guardarEntidad(carrera);
//		System.out.println("Carrera actualizada: "+carreraDao.buscarPorId(1L).orElse(new Carrera()).toString());
//		
		
		
	}
	
	

}
