package com.example.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "usuarios")
public class Usuario {
    
    @Id
    private String id;
    private String nombre;
    private String email;
    private Integer prioridad;

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }
}
