package com.agency04.sbss.pizza;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.agency04.sbss.pizza")
public class PizzaConfig {

    private PizzaDeliveryService delService;

    //bean za servis
    @Bean
    public PizzaDeliveryService delService(){ //interface
        return new PizzaDeliveryServiceImpl();//klasa

    }
    //bean za klasu i injection
    @Bean
    @Primary
    public Pizza PizzeriaDalmatino(){
        return (Pizza) new PizzeriaDalmatino(delService);
        }
    


}
