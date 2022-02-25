package com.ramiro.api.universidaded.servicios;

import java.util.Optional;

import com.ramiro.api.universidaded.entities.Carrera;

public interface GenericoDAO<E>{
	public Optional<E> buscarPorId(Long id);
	public Iterable<E> buscarTodos();
	public E guardarEntidad(E entidad);
	public void eliminarPorId(Long id);
}
