package com.ramiro.api.universidaded.entities;

public class Alumno extends Persona{

	

	public Alumno() {
		super();
	}

	public Alumno(Long id, String nombre, String apellido, String dni, String usuarioCreacion, Direccion direccion) {
		super(id, nombre, apellido, dni, usuarioCreacion, direccion);
	}
	private static final long serialVersionUID = 1L;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Alumno []");
		return builder.toString();
	}
	
	

}
