package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Usuario;
import com.example.demo.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.insert(usuario);
    }

    public List<Usuario> obtenerUsuarios() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> obtenerPorID(String ID) {
        return usuarioRepository.findById(ID);
    }

    public List<Usuario> obtenerPorNombre(String nombre) {
        return usuarioRepository.findByNombre(nombre);
    }

    public List<Usuario> obtenerPorEmail(String email) {
        return obtenerPorEmail(email);
    }

    public List<Usuario> obtenerPorPrioridad(Integer prioridad) {
        return usuarioRepository.findByPrioridad(prioridad);
    }

    public Usuario actulizarUsuario(Usuario usuario) {
        return usuarioRepository.insert(usuario);
    }

    public boolean eliminarUsuario(String ID) {
        try {
            usuarioRepository.deleteById(ID);
            return true;
        }catch(Exception e) {
            return false;
        }
    }
}
