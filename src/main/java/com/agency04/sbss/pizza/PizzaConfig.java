package com.agency04.sbss.pizza;

import org.springframework.context.annotation.*;

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
    @PropertySource("classpath:application.properties")
    public PizzeriaDalmatino PizzeriaDalmatino(){
        return  new PizzeriaDalmatino();
        }
    


}
