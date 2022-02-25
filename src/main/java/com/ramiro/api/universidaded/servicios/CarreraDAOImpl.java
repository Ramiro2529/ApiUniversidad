package com.ramiro.api.universidaded.servicios;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ramiro.api.universidaded.entities.Carrera;
import com.ramiro.api.universidaded.repositorios.CarreraRepositorio;

@Service
public class CarreraDAOImpl extends GenericoDAOImpl<Carrera,CarreraRepositorio> implements CarreraDAO {

	@Autowired
	public CarreraDAOImpl(CarreraRepositorio repositorio) {
		super(repositorio);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Carrera> findCarrerasByNombreContains(String nombre) {
		
		return repositorio.findCarrerasByNombreContains(nombre);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Carrera> findCarrerasByNombreContainsIgnoreCase(String nombre) {
		
		return repositorio.findCarrerasByNombreContainsIgnoreCase(nombre);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Carrera> findCarrerasByCantidadAniosAfter(Integer cantidadAnios) {
		return repositorio.findCarrerasByCantidadAniosAfter(cantidadAnios);
	}


	

	

}
