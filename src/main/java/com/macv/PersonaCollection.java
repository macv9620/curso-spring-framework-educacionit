package com.macv;

import java.util.List;

public class PersonaCollection {
    private Long id;
    private String nombre;
    private List<Domicilio> domicilios;

    public PersonaCollection() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Domicilio> getDomicilios() {
        return domicilios;
    }

    public void setDomicilios(List<Domicilio> domicilios) {
        this.domicilios = domicilios;
    }

    @Override
    public String toString() {
        return "PersonaCollection{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", domicilios=" + domicilios +
                '}';
    }
}
