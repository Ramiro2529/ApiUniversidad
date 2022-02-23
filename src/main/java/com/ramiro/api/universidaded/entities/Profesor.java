package com.ramiro.api.universidaded.entities;

import java.math.BigDecimal;

public class Profesor extends Persona{

	private BigDecimal sueldo;
	private static final long serialVersionUID = 1L;
	public Profesor() {
		super();
	}
	public Profesor(Long id, String nombre, String apellido, String dni, String usuarioCreacion, Direccion direccion, BigDecimal sueldo) {
		super(id, nombre, apellido, dni, usuarioCreacion, direccion);
		this.sueldo=sueldo;
	}
	
	public BigDecimal getSueldo() {
		return sueldo;
	}
	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Profesor [sueldo=");
		builder.append(sueldo);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
