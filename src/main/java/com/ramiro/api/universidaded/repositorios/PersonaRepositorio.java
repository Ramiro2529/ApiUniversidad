package com.ramiro.api.universidaded.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.ramiro.api.universidaded.entities.Persona;

@NoRepositoryBean
public interface PersonaRepositorio extends CrudRepository<Persona, Long> {

	@Query("select p from Persona p where p.nombre = ?1 and p.apellido = ?2")
	public Optional<Persona> buscarPorNombreYApellido(String nombre, String apellido);
	@Query("select p from Persona p where p.dni = ?1")
	public Optional<Persona> buscarPorDni(String dni);
	@Query("select p from Persona p where p.apellido like %?1%")
	public Iterable<Persona> buscarPersonaPorApellido(String apellido);
	
}
