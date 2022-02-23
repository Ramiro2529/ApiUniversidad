package com.ramiro.api.universidaded.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name = "carreras", schema = "universidad")
public class Carrera implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre_carrera", nullable = false, length = 40)
	private String nombreCarrera;
	@Column(name = "cantidad_materias")
	private Integer cantidadMaterias;
	@Column(name = "cantidad_anios")
	private Integer cantidadAnios;
	@Column(name = "usuario_creacion", nullable = false)
	private String usuarioCreacion;
	@Column(name = "fecha_creacion", nullable = false)
	private Date fechaCreacion;
	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "carrera", fetch = FetchType.LAZY)
	private Set<Alumno> alumnos;
	@ManyToMany(mappedBy = "carreras", fetch = FetchType.LAZY)
	private Set<Profesor> profesores;
	
	
	public Carrera() {
		
	}
	public Carrera(Long id, String nombreCarrera, Integer cantidadMaterias, Integer cantidadAnios,
			String usuarioCreacion) {
		super();
		this.id = id;
		this.nombreCarrera = nombreCarrera;
		this.cantidadMaterias = cantidadMaterias;
		this.cantidadAnios = cantidadAnios;
		this.usuarioCreacion = usuarioCreacion;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreCarrera() {
		return nombreCarrera;
	}
	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}
	public Integer getCantidadMaterias() {
		return cantidadMaterias;
	}
	public void setCantidadMaterias(Integer cantidadMaterias) {
		this.cantidadMaterias = cantidadMaterias;
	}
	public Integer getCantidadAnios() {
		return cantidadAnios;
	}
	public void setCantidadAnios(Integer cantidadAnios) {
		this.cantidadAnios = cantidadAnios;
	}
	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}
	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carrera [id=");
		builder.append(id);
		builder.append(", nombreCarrera=");
		builder.append(nombreCarrera);
		builder.append(", cantidadMaterias=");
		builder.append(cantidadMaterias);
		builder.append(", cantidadAnios=");
		builder.append(cantidadAnios);
		builder.append(", usuarioCreacion=");
		builder.append(usuarioCreacion);
		builder.append(", fechaCreacion=");
		builder.append(fechaCreacion);
		builder.append(", fechaModificacion=");
		builder.append(fechaModificacion);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, nombreCarrera);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carrera other = (Carrera) obj;
		return Objects.equals(id, other.id) && Objects.equals(nombreCarrera, other.nombreCarrera);
	}
	@PrePersist
	public void antesPersistir() {
		this.fechaCreacion=new Date();
	}
	@PreUpdate
	public void despuesPersistir() {
		this.fechaModificacion=new Date();
	}
	

}
