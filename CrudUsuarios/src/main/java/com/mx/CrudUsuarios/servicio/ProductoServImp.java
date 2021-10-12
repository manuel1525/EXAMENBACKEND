package com.mx.CrudUsuarios.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mx.CrudUsuarios.dao.ProductoDao;
import com.mx.CrudUsuarios.dominio.Productos;

public class ProductoServImp implements ProductoServ{

	@Autowired
	ProductoDao productoDao;
	@Override
	public void guardar(Productos productos) {
		// TODO Auto-generated method stub
		productoDao.save(productos);
	}

	@Override
	public void editar(Productos productos) {
		// TODO Auto-generated method stub
		productoDao.save(productos);
	}

	@Override
	public void eliminar(Productos productos) {
		// TODO Auto-generated method stub
		productoDao.delete(productos);
	}

	@Override
	public Productos buscar(Productos productos) {
		// TODO Auto-generated method stub
		return productoDao.findById(productos.getId()).orElse(null);
	}

	@Override
	public List<Productos> listar() {
		// TODO Auto-generated method stub
		return (List<Productos>) productoDao.findAll();
	}

}
