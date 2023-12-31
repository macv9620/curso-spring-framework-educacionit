package com.macv.ejemplos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("cicloDeVidaContext.xml");
        CicloDeVida bean = (CicloDeVida) context.getBean("cicloDeVida");

        System.out.println(bean);

        ((ConfigurableApplicationContext) context).close();
    }
}