package com.ramiro.api.universidaded.servicios;

import java.util.Optional;

import com.ramiro.api.universidaded.entities.Carrera;
import com.ramiro.api.universidaded.entities.Persona;

public interface AlumnoDAO extends PersonaDAO {
	
	public Iterable<Persona> buscarAlumnosPorNombre(String nombre);
}
