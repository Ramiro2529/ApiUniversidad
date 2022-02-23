package com.ramiro.api.universidaded.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "alumnos", schema = "universidad")
@PrimaryKeyJoinColumn(name = "persona_id")
public class Alumno extends Persona{

	@ManyToOne(optional = true, cascade = {CascadeType.PERSIST,CascadeType.MERGE}, fetch = FetchType.LAZY)
	@JoinColumn(name = "carrera_id", foreignKey = @ForeignKey(name="FK_CARRERA_ID"))
	private Carrera carrera;

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
