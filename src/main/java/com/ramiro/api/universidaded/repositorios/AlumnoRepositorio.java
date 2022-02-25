package com.ramiro.api.universidaded.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ramiro.api.universidaded.entities.Persona;

@Repository("alumnoRepositorio")
public interface AlumnoRepositorio extends PersonaRepositorio{

	@Query("select a from Alumno a where a.carrera.nombre = ?1")
	public Iterable<Persona> buscarAlumnosPorNombre(String nombre);
}
