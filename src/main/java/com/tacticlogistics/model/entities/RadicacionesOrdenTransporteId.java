package com.tacticlogistics.model.entities;
// Generated 28/09/2015 11:33:59 AM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RadicacionesOrdenTransporteId generated by hbm2java
 */
@Embeddable
public class RadicacionesOrdenTransporteId implements java.io.Serializable {

	private int radicacionOrdenTransporteId;
	private int clienteId;
	private byte tipoOrdenTransporteId;

	public RadicacionesOrdenTransporteId() {
	}

	public RadicacionesOrdenTransporteId(int radicacionOrdenTransporteId, int clienteId, byte tipoOrdenTransporteId) {
		this.radicacionOrdenTransporteId = radicacionOrdenTransporteId;
		this.clienteId = clienteId;
		this.tipoOrdenTransporteId = tipoOrdenTransporteId;
	}

	@Column(name = "Radicacion_Orden_Transporte_Id", nullable = false)
	public int getRadicacionOrdenTransporteId() {
		return this.radicacionOrdenTransporteId;
	}

	public void setRadicacionOrdenTransporteId(int radicacionOrdenTransporteId) {
		this.radicacionOrdenTransporteId = radicacionOrdenTransporteId;
	}

	@Column(name = "Cliente_Id", nullable = false)
	public int getClienteId() {
		return this.clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	@Column(name = "Tipo_Orden_Transporte_Id", nullable = false)
	public byte getTipoOrdenTransporteId() {
		return this.tipoOrdenTransporteId;
	}

	public void setTipoOrdenTransporteId(byte tipoOrdenTransporteId) {
		this.tipoOrdenTransporteId = tipoOrdenTransporteId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RadicacionesOrdenTransporteId))
			return false;
		RadicacionesOrdenTransporteId castOther = (RadicacionesOrdenTransporteId) other;

		return (this.getRadicacionOrdenTransporteId() == castOther.getRadicacionOrdenTransporteId())
				&& (this.getClienteId() == castOther.getClienteId())
				&& (this.getTipoOrdenTransporteId() == castOther.getTipoOrdenTransporteId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getRadicacionOrdenTransporteId();
		result = 37 * result + this.getClienteId();
		result = 37 * result + this.getTipoOrdenTransporteId();
		return result;
	}

}
