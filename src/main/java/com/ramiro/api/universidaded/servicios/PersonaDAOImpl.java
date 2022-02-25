package com.ramiro.api.universidaded.servicios;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ramiro.api.universidaded.entities.Persona;
import com.ramiro.api.universidaded.repositorios.PersonaRepositorio;

@Service
public class PersonaDAOImpl extends GenericoDAOImpl<Persona, PersonaRepositorio> implements PersonaDAO{


	public PersonaDAOImpl(PersonaRepositorio repositorio) {
		super(repositorio);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Persona> buscarPorNombreYApellido(String nombre, String apellido) {
		return repositorio.buscarPorNombreYApellido(nombre, apellido);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Persona> buscarPorDni(String dni) {
		return repositorio.buscarPorDni(dni);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Persona> buscarPersonaPorApellido(String apellido) {
		return repositorio.buscarPersonaPorApellido(apellido);
	}

}