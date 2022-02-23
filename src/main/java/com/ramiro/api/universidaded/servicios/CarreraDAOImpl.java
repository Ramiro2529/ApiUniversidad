package com.ramiro.api.universidaded.servicios;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ramiro.api.universidaded.entities.Carrera;
import com.ramiro.api.universidaded.repositorios.CarreraRepositorio;

@Service
public class CarreraDAOImpl implements CarreraDAO {

	@Autowired
	private CarreraRepositorio carreraRepositorio;
	
	@Override
	@Transactional(readOnly = true)
	public Optional<Carrera> buscarPorId(Long id) {
		return carreraRepositorio.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Carrera> buscarTodos() {
		return carreraRepositorio.findAll();
	}

	@Override
	@Transactional
	public Carrera guardarCarrera(Carrera carrera) {
		return carreraRepositorio.save(carrera);
	}

	@Override
	@Transactional
	public void eliminarPorId(Long id) {
		carreraRepositorio.deleteById(id);
	}

	

	

}
