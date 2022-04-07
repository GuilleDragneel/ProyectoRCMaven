package com.rest.online.model;

import com.rest.online.entity.Usuario;
import java.util.List;

public interface IUsuarioModel {

    public void crearRegistro(Usuario usuario);

    public void actualizarRegistro(Usuario usuario);

    public void eliminarRegistro(Usuario usuario);

    public List obtenerRegistros();

    public Usuario obtenerRegistro(int idUsuario);
}
