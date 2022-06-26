package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Usuario;
import com.example.demo.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;

    @PostMapping()
    public Usuario guardarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.guardarUsuario(usuario);
    }

    @GetMapping()
    public List<Usuario> obtenerUsuarios() {
        return usuarioService.obtenerUsuarios();
    }

    @GetMapping("/{id}")
    public Optional<Usuario> obtenerUsuarioPorID(@PathVariable("id") String ID) {
        return usuarioService.obtenerPorID(ID);
    }

    @GetMapping("/n")
    public List<Usuario> obtenerUsuarioPorNombre(@RequestParam("nombre") String nombre) {
        return usuarioService.obtenerPorNombre(nombre);
    }

    @GetMapping("/e")
    public List<Usuario> obtenerUsuarioPorEmail(@RequestParam("email") String email) {
        return usuarioService.obtenerPorEmail(email);
    }

    @GetMapping("/p")
    public List<Usuario> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad) {
        return usuarioService.obtenerPorPrioridad(prioridad);
    }

    @PutMapping()
    public Usuario actualizarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.actulizarUsuario(usuario);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorID(@PathVariable("id") String ID) {
        boolean ok = this.usuarioService.eliminarUsuario(ID);
        if(ok) {
            return "Se eliminó el usuario con ID = "+ID;
        }else {
            return "No pudo eliminar el usuario con ID = "+ID;
        }
    }
}
