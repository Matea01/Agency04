package com.agency04.sbss.pizza;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.agency04.sbss.pizza")
public class PizzaConfig {

    private PizzaDeliveryService delService;

    @Bean
    public PizzaDeliveryServiceImpl delService(){ //interface
        return new PizzaDeliveryServiceImpl();//klasa

    }
    @Bean
    @Primary
    public PizzeriaDalmatino PizzeriaDalmatino(){
        return  new PizzeriaDalmatino();
        }
    


}
