package com.ramiro.api.universidaded.servicios;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public class GenericoDAOImpl <E, R extends CrudRepository<E, Long>> implements GenericoDAO<E>{

	protected final R repositorio;
	
	public GenericoDAOImpl(R repositorio) {
		this.repositorio=repositorio;
	}
	
	@Override
	@Transactional(readOnly = true)
	public Optional<E> buscarPorId(Long id) {
		return repositorio.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<E> buscarTodos() {
		return repositorio.findAll();
	}

	@Override
	@Transactional
	public E guardarEntidad(E entidad) {
		return repositorio.save(entidad);
	}

	@Override
	@Transactional
	public void eliminarPorId(Long id) {
		repositorio.deleteById(id);
	}
	

}
