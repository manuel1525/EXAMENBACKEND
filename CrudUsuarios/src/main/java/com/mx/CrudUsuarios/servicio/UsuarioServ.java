package com.mx.CrudUsuarios.servicio;

import java.util.List;

import com.mx.CrudUsuarios.dominio.Usuarios;

public interface UsuarioServ {
	
	public void guardar(Usuarios usuarios);
	public void editar(Usuarios usuarios);
	public void eliminar(Usuarios usuarios);
	
	public Usuarios buscar(Usuarios usuarios);
	public List<Usuarios> listar();

}
