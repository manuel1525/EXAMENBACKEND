package com.mx.CrudUsuarios.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Usuarios")
public class Usuarios {

	@Id
	int id;
	String nombre;
	String fechanac;
	String ciudadr;
	String rfc;
	String descripcion;
	
	public Usuarios() {
		
	}

	public Usuarios(int id, String nombre, String fechanac, String ciudadr, String rfc, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.fechanac = fechanac;
		this.ciudadr = ciudadr;
		this.rfc = rfc;
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", nombre=" + nombre + ", fechanac=" + fechanac + ", ciudadr=" + ciudadr
				+ ", rfc=" + rfc + ", descripcion=" + descripcion + "]\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechanac() {
		return fechanac;
	}

	public void setFechanac(String fechanac) {
		this.fechanac = fechanac;
	}

	public String getCiudadr() {
		return ciudadr;
	}

	public void setCiudadr(String ciudadr) {
		this.ciudadr = ciudadr;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
