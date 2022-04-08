package com.rest.online.service;

import com.rest.online.entity.Usuario;
import com.rest.online.model.IUsuarioModel;
import com.rest.online.model.UsuarioModelimpl;
import java.util.List;

public class IUsuarioServiceimpl implements IUsuarioService {

    IUsuarioModel modelo = new UsuarioModelimpl();

    public void crearRegistro(Usuario usuario) {
        modelo.crearRegistro(usuario);
    }

    public void actualizarRegistro(Usuario usuario) {
        modelo.actualizarRegistro(usuario);
    }

    public void eliminarRegistro(Usuario usuario) {
        modelo.eliminarRegistro(usuario);
    }

    public List<Usuario> obtenerRegistros() {
        return modelo.obtenerRegistros();
    }

    public Usuario obtenerRegistro(int idUsuario) {
        return modelo.obtenerRegistro(idUsuario);
    }

}
