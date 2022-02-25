package com.ramiro.api.universidaded.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ramiro.api.universidaded.entities.Carrera;

@Repository
public interface CarreraRepositorio extends CrudRepository<Carrera, Long>{

	public Iterable<Carrera> findCarrerasByNombreContains(String nombre);
	public Iterable<Carrera> findCarrerasByNombreContainsIgnoreCase(String nombre);
	public Iterable<Carrera> findCarrerasByCantidadAniosAfter(Integer cantidadAnios);
	
	
}
