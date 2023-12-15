package com.macv.ejemplo6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {

    @Bean("primerBeanAnotaciones")
    public PrimerBeanAnotaciones getPrimerBeanAnotaciones(){
        return new PrimerBeanAnotaciones();
    }
}
