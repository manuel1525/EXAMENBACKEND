package com.mx.CrudUsuarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudUsuarios.dominio.Productos;
import com.mx.CrudUsuarios.servicio.ProductoServ;


@RestController
@RequestMapping("ProductoWs")
@CrossOrigin
public class ProductoWs {

	@Autowired
	ProductoServ productoServ;
	
	@GetMapping("listar")
	public List<Productos> listar(){
		List<Productos> lista = productoServ.listar();
		System.out.println("lista-->"+lista);
		return lista;
	}//cierra listar
	
	@PostMapping("guardar")
	public void guardar (@RequestBody Productos productos) {
		productoServ.guardar(productos);
	}//cierra guardar
	
	@PostMapping("editar")
	public void editar(@RequestBody Productos productos) {
		productoServ.editar(productos);
	}//cierra editar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Productos productos) {
		productoServ.eliminar(productos);
	}//cierra eliminar}
	
	@PostMapping("buscar")
	public Productos buscar(@RequestBody Productos productos) {
		productos= productoServ.buscar(productos);
		return productos;
	}//cierra eliminar
}
