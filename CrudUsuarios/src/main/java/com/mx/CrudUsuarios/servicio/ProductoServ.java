package com.mx.CrudUsuarios.servicio;

import java.util.List;

import com.mx.CrudUsuarios.dominio.Productos;

public interface ProductoServ {

	public void guardar(Productos productos);
	public void editar(Productos productos);
	public void eliminar(Productos productos);
	
	public Productos buscar(Productos productos);
	public List<Productos> listar();
}
