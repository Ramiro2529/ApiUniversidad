package com.ramiro.api.universidaded.entities;

import java.math.BigDecimal;

import com.ramiro.api.universidaded.enums.TipoEmpleado;

public class Empleado extends Persona{

	private BigDecimal sueldo;
	private TipoEmpleado tipoEmpleado;
	private static final long serialVersionUID = 1L;
	
	
	public Empleado() {
	}
	public Empleado(Long id, String nombre, String apellido, String dni, String usuarioCreacion, Direccion direccion, BigDecimal sueldo, TipoEmpleado tipoEmpleado) {
		super(id, nombre, apellido, dni, usuarioCreacion, direccion);
		this.sueldo=sueldo;
		this.tipoEmpleado=tipoEmpleado;
	}
	public BigDecimal getSueldo() {
		return sueldo;
	}
	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}
	public TipoEmpleado getTipoEmpleado() {
		return tipoEmpleado;
	}
	public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Empleado [sueldo=");
		builder.append(sueldo);
		builder.append(", tipoEmpleado=");
		builder.append(tipoEmpleado);
		builder.append("]");
		return builder.toString();
	}
	
	

}
