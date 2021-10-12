package com.mx.CrudUsuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.CrudUsuarios.dominio.Usuarios;

@Controller
@RequestMapping("UsuarioCtrl")
@CrossOrigin
public class UsuarioCtrl {


	@Autowired
	UsuarioWs usuarioServ;
	
	@GetMapping("inicio")
	public String inicio(Model model) {
		var lista = usuarioServ.listar();
		model.addAttribute("lista", lista);
		return "index";
	}
	
	@GetMapping("alta")
	public String alta(Usuarios usuarios) {
		
		return "guardar";
	}
	
	@PostMapping("guardar")
	public String guardar(Usuarios usuarios) {
		usuarioServ.guardar(usuarios);
		return "redirect:inicio";
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(Usuarios usuarios, Model model) {
		usuarios = usuarioServ.buscar(usuarios);
		model.addAttribute("usuarios", usuarios);
		return "eliminar";
	}
	
	@PostMapping("delete")
	public String delete(Usuarios usuarios) {
		usuarioServ.aliminar(usuarios);
		return "redirect:inicio";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(Usuarios usuarios, Model model)
	{
		usuarios = usuarioServ.buscar(usuarios);
		model.addAttribute("usuarios", usuarios);
		return "editar";
	}
	
	@PostMapping("update")
	public String update(Usuarios usuarios) {
		usuarioServ.editar(usuarios);
		return "redirect:inicio";
	}
}
