package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;

import java.util.List;

public interface UsuarioDao {


    void eliminar(Long id);

    void registrar(Usuario usuario);

    Usuario obtenerUsuarioPorCredenciales(Usuario usuario);

    List<Usuario> getUsuarios();
}
