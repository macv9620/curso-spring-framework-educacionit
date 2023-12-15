package com.macv.ejemplo5;

import com.macv.ejemplos.CicloDeVida;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PruebaInyeccionInterfaz {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Empleado empleado = (Empleado) context.getBean("empleado");

        System.out.println(empleado);
        empleado.getContratacion().mostrar();
    }
}
