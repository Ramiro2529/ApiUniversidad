package com.ramiro.api.universidaded.servicios;

import java.util.Optional;

import com.ramiro.api.universidaded.entities.Carrera;

public interface CarreraDAO {
	
	public Optional<Carrera> buscarPorId(Long id);
	public Iterable<Carrera> buscarTodos();
	public Carrera guardarCarrera(Carrera carrera);
	public void eliminarPorId(Long id);

}
