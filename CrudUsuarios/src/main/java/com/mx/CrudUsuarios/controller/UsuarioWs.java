package com.mx.CrudUsuarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudUsuarios.dominio.Usuarios;
import com.mx.CrudUsuarios.servicio.UsuarioServ;

@RestController
@RequestMapping("UsuarioWs")
@CrossOrigin
public class UsuarioWs {

	@Autowired
	UsuarioServ usuarioServ;
	
	@GetMapping("listar")
	public List<Usuarios> listar(){
		List<Usuarios> lista = usuarioServ.listar();
		System.out.println("lista-->"+lista);
		return lista;
	}
	
	@PostMapping("guardar")
	public void guardar(@RequestBody Usuarios usuarios) {
		usuarioServ.guardar(usuarios);
	}
	
	@PostMapping("editar")
	public void editar(@RequestBody Usuarios usuarios) {
		usuarioServ.editar(usuarios);
	}
	@PostMapping("eliminar")
	public void aliminar(@RequestBody Usuarios usuarios) {
		usuarioServ.eliminar(usuarios);
	}
	@PostMapping("buscar")
	public Usuarios buscar(@RequestBody Usuarios usuarios) {
		usuarios = usuarioServ.buscar(usuarios);
		return usuarios;
	}//cierra eliminar
}
