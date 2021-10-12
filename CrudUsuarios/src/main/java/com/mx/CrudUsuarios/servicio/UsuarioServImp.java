package com.mx.CrudUsuarios.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudUsuarios.dao.UsuarioDao;
import com.mx.CrudUsuarios.dominio.Usuarios;

@Service
public class UsuarioServImp implements UsuarioServ {

	@Autowired
	UsuarioDao usuarioDao;
	
	public void guardar(Usuarios usuarios) {
		// TODO Auto-generated method stub
		usuarioDao.save(usuarios);
	}

	@Override
	public void editar(Usuarios usuarios) {
		// TODO Auto-generated method stub
		usuarioDao.save(usuarios);
	}

	@Override
	public void eliminar(Usuarios usuarios) {
		// TODO Auto-generated method stub
		usuarioDao.delete(usuarios);
	}

	@Override
	public Usuarios buscar(Usuarios usuarios) {
		// TODO Auto-generated method stub
		return usuarioDao.findById(usuarios.getId()).orElse(null);
	}

	@Override
	public List<Usuarios> listar() {
		// TODO Auto-generated method stub
		return (List<Usuarios>) usuarioDao.findAll();
	}

}
