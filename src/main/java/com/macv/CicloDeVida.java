package com.macv;

public class CicloDeVida {
    private String nombre;

    public CicloDeVida() {
    }

    public void metodoIniciacion(){
        System.out.println("Inicializando el bean");
    }

    public void metodoDestruccion(){
        System.out.println("Bean destruido");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "CicloDeVida{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
