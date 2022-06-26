package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Usuario;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    public abstract List<Usuario> findByNombre(String nombre);
    public abstract List<Usuario> findByEmail(String email);
    public abstract List<Usuario> findByPrioridad(Integer prioridad);
}
