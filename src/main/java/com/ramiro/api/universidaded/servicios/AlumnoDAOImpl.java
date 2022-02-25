package com.ramiro.api.universidaded.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ramiro.api.universidaded.entities.Persona;
import com.ramiro.api.universidaded.repositorios.AlumnoRepositorio;
import com.ramiro.api.universidaded.repositorios.PersonaRepositorio;

@Service
public class AlumnoDAOImpl extends PersonaDAOImpl implements AlumnoDAO {
	
	@Autowired
	public AlumnoDAOImpl(@Qualifier("alumnoRepositorio")PersonaRepositorio repositorio) {
		super(repositorio);
	}

	@Override
	public Iterable<Persona> buscarAlumnosPorNombre(String nombre) {
		return ((AlumnoRepositorio)repositorio).buscarAlumnosPorNombre(nombre);
	}
	
}
