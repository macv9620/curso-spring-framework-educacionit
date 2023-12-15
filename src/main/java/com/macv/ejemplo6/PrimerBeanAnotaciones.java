package com.macv.ejemplo6;

import org.springframework.beans.factory.annotation.Value;

public class PrimerBeanAnotaciones {

    @Value("Hola desde Value")
    private String saludo;

    public PrimerBeanAnotaciones() {
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public void mostrarMensaje(String mensaje){
        System.out.println(saludo + " " + mensaje);
    }

    @Override
    public String toString() {
        return "PrimerBeanAnotaciones{" +
                "saludo='" + saludo + '\'' +
                '}';
    }
}
