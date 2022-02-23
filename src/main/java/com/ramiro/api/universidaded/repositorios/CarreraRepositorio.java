package com.ramiro.api.universidaded.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ramiro.api.universidaded.entities.Carrera;

@Repository
public interface CarreraRepositorio extends CrudRepository<Carrera, Long>{

	
	
}
