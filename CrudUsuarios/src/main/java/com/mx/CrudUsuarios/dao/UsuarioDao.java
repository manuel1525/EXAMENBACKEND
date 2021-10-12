package com.mx.CrudUsuarios.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.CrudUsuarios.dominio.Usuarios;

public interface UsuarioDao  extends CrudRepository<Usuarios, Integer> {

}
