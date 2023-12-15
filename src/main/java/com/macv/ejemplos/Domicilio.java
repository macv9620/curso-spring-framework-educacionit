package com.macv.ejemplos;

public class Domicilio {
    String direccion;

    public Domicilio() {
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "direccion='" + direccion + '\'' +
                '}';
    }
}
