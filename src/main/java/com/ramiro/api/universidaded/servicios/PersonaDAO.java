package com.ramiro.api.universidaded.servicios;

import java.util.Optional;

import com.ramiro.api.universidaded.entities.Persona;

public interface PersonaDAO extends GenericoDAO<Persona>{
	public Optional<Persona> buscarPorNombreYApellido(String nombre, String apellido);
	public Optional<Persona> buscarPorDni(String dni);
	public Iterable<Persona> buscarPersonaPorApellido(String apellido);
}
