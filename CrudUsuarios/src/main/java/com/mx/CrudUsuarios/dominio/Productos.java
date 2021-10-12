package com.mx.CrudUsuarios.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="PRODUCTO")
public class Productos {

	@Id
	int id;
	String nombre;
	String tipo;
	double precio;
	Usuarios id_usuario;
	
	public Productos() {}

	public Productos(int id, String nombre, String tipo, double precio, Usuarios id_usuario) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
		this.id_usuario = id_usuario;
	}

	@Override
	public String toString() {
		return "Productos [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio + ", id_usuario="
				+ id_usuario + "]\n";
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Usuarios getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Usuarios id_usuario) {
		this.id_usuario = id_usuario;
	}
	
}
