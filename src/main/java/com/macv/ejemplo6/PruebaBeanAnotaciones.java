package com.macv.ejemplo6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PruebaBeanAnotaciones {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);

        PrimerBeanAnotaciones beanAnotaciones = (PrimerBeanAnotaciones) context.getBean("primerBeanAnotaciones");

        System.out.println(beanAnotaciones);
    }
}
