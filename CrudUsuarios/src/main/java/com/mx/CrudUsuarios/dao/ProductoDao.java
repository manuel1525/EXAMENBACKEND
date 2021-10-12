package com.mx.CrudUsuarios.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.CrudUsuarios.dominio.Productos;

public interface ProductoDao extends CrudRepository<Productos, Integer> {

}
