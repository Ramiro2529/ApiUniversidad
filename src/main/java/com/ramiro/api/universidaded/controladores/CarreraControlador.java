package com.ramiro.api.universidaded.controladores;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ramiro.api.universidaded.entities.Carrera;
import com.ramiro.api.universidaded.servicios.CarreraDAO;

@RestController
public class CarreraControlador {
	
	@Autowired
	private CarreraDAO carreraDao;
	
	@GetMapping("listarCarreras")
	public Iterable<Carrera> listarCarreras(){
		
		return carreraDao.buscarTodos();
	}
	
	@GetMapping("buscarCarreraId/id/{id}")
	public Optional<Carrera> buscarCarreraId(@PathVariable Long id){
		return carreraDao.buscarPorId(id);
	}

}
