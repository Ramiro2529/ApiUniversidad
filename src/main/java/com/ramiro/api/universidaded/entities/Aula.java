package com.ramiro.api.universidaded.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.ramiro.api.universidaded.enums.TipoEmpleado;
import com.ramiro.api.universidaded.enums.TipoPizarron;

public class Aula implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "numero_aula", nullable = false, length = 6)
	private Integer numeroAula;
	@Column(name = "medidas")
	private String medidas;
	@Column(name = "cantidad_pupitres")
	private Integer cantidadPupitres;
	@Column(name = "tipo_pizarron")
	@Enumerated(EnumType.STRING)
	private TipoPizarron tipoPizarron;
	@Column(name = "usuario_creacion", nullable = false)
	private String usuarioCreacion;
	@Column(name = "fecha_creacion", nullable = false)
	private Date fechaCreacion;
	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;
	
	@ManyToOne(optional = true, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "pabellon_id", foreignKey = @ForeignKey(name="FK_PABELLON_ID"))
	private Pabellon pabellon;

	private static final long serialVersionUID = 1L;

	public Aula(Long id, Integer numeroAula, String medidas, Integer cantidadPupitres, TipoPizarron tipoPizarron,
			String usuarioCreacion) {
		this.id = id;
		this.numeroAula = numeroAula;
		this.medidas = medidas;
		this.cantidadPupitres = cantidadPupitres;
		this.tipoPizarron = tipoPizarron;
		this.usuarioCreacion = usuarioCreacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNumeroAula() {
		return numeroAula;
	}

	public void setNumeroAula(Integer numeroAula) {
		this.numeroAula = numeroAula;
	}

	public String getMedidas() {
		return medidas;
	}

	public void setMedidas(String medidas) {
		this.medidas = medidas;
	}

	public Integer getCantidadPupitres() {
		return cantidadPupitres;
	}

	public void setCantidadPupitres(Integer cantidadPupitres) {
		this.cantidadPupitres = cantidadPupitres;
	}

	public TipoPizarron getTipoPizarron() {
		return tipoPizarron;
	}

	public void setTipoPizarron(TipoPizarron tipoPizarron) {
		this.tipoPizarron = tipoPizarron;
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
		builder.append("Aula [id=");
		builder.append(id);
		builder.append(", numeroAula=");
		builder.append(numeroAula);
		builder.append(", medidas=");
		builder.append(medidas);
		builder.append(", cantidadPupitres=");
		builder.append(cantidadPupitres);
		builder.append(", tipoPizarron=");
		builder.append(tipoPizarron);
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
		return Objects.hash(id, numeroAula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aula other = (Aula) obj;
		return Objects.equals(id, other.id) && Objects.equals(numeroAula, other.numeroAula);
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
