package com.ramiro.api.universidaded.servicios;

import java.util.Optional;

import com.ramiro.api.universidaded.entities.Carrera;

public interface CarreraDAO extends GenericoDAO<Carrera>{
	
	public Iterable<Carrera> findCarrerasByNombreContains(String nombre);
	public Iterable<Carrera> findCarrerasByNombreContainsIgnoreCase(String nombre);
	public Iterable<Carrera> findCarrerasByCantidadAniosAfter(Integer cantidadAnios);
	

}
