package com.tacticlogistics.model.entities;
// Generated 28/09/2015 11:33:59 AM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Paises generated by hbm2java
 */
@Entity
@Table(name = "Paises", catalog = "dbo", uniqueConstraints = { @UniqueConstraint(columnNames = "Codigo"),
		@UniqueConstraint(columnNames = "Nombre") })
public class Paises implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Short paisId;
	private String codigo;
	private String nombre;
	private Short ordinal;
	private Boolean activo;
	private Date fechaActualizacion;
	private String usuarioActualizacion;
	private Set<Departamentos> departamentoses = new HashSet<Departamentos>(0);

	public Paises() {
	}

	public Paises(Short paisId, String codigo, String nombre, Short ordinal, Boolean activo, Date fechaActualizacion,
			String usuarioActualizacion) {
		this.paisId = paisId;
		this.codigo = codigo;
		this.nombre = nombre;
		this.ordinal = ordinal;
		this.activo = activo;
		this.fechaActualizacion = fechaActualizacion;
		this.usuarioActualizacion = usuarioActualizacion;
	}

	public Paises(Short paisId, String codigo, String nombre, Short ordinal, Boolean activo, Date fechaActualizacion,
			String usuarioActualizacion, Set<Departamentos> departamentoses) {
		this.paisId = paisId;
		this.codigo = codigo;
		this.nombre = nombre;
		this.ordinal = ordinal;
		this.activo = activo;
		this.fechaActualizacion = fechaActualizacion;
		this.usuarioActualizacion = usuarioActualizacion;
		this.departamentoses = departamentoses;
	}

	@Id

	@Column(name = "Pais_Id", unique = true, nullable = false)
	public Short getPaisId() {
		return this.paisId;
	}

	public void setPaisId(Short paisId) {
		this.paisId = paisId;
	}

	@Column(name = "Codigo", unique = true, nullable = false, length = 3)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "Nombre", unique = true, nullable = false, length = 200)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "Ordinal", nullable = false)
	public Short getOrdinal() {
		return this.ordinal;
	}

	public void setOrdinal(Short ordinal) {
		this.ordinal = ordinal;
	}

	@Column(name = "Activo", nullable = false)
	public Boolean isActivo() {
		return this.activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Fecha_Actualizacion", nullable = false, length = 19)
	public Date getFechaActualizacion() {
		return this.fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	@Column(name = "Usuario_Actualizacion", nullable = false, length = 50)
	public String getUsuarioActualizacion() {
		return this.usuarioActualizacion;
	}

	public void setUsuarioActualizacion(String usuarioActualizacion) {
		this.usuarioActualizacion = usuarioActualizacion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "paises")
	public Set<Departamentos> getDepartamentoses() {
		return this.departamentoses;
	}

	public void setDepartamentoses(Set<Departamentos> departamentoses) {
		this.departamentoses = departamentoses;
	}

}