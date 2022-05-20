package com.sinensia.juegos11.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "JUEGOS")
public class Juego implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String codigo;
	private String titulo;
	
	@Temporal(TemporalType.DATE)
	private Date fechaAlta;
	
	private double precio;
	private boolean descatalogado;
	
	@Enumerated(EnumType.STRING)
	private Tipo tipoJuego;
	
	@ManyToOne
	@JoinColumn(name = "CODIGO_FABRICANTE")
	private Fabricante fabricante;
	
	
	public Juego() {
		
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Date getFechaAlta() {
		return fechaAlta;
	}


	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isDescatalogado() {
		return descatalogado;
	}

	public void setDescatalogado(boolean descatalogado) {
		this.descatalogado = descatalogado;
	}

	public Tipo getTipoJuego() {
		return tipoJuego;
	}

	public void setTipoJuegoTipo(Tipo tipoJuego) {
		this.tipoJuego = tipoJuego;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Juego other = (Juego) obj;
		return Objects.equals(codigo, other.codigo);
	}

	@Override
	public String toString() {
		return "Juego [codigo=" + codigo + ", titulo=" + titulo + ", fechaAlta=" + fechaAlta + ", precio=" + precio
				+ ", descatalogado=" + descatalogado + ", tipoJuegoTipo=" + tipoJuego + ", fabricante=" + fabricante
				+ "]";
	}
	
	
	
	
}
