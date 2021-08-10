package com.agency04.sbss.pizza;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.agency04.sbss.pizza")
@PropertySource({})
public class PizzaConfig {

    private PizzaDeliveryService delService;

    @Bean
    public PizzaDeliveryServiceImpl delService(){ //interface
        return new PizzaDeliveryServiceImpl();//klasa

    }
    @Bean
    @Primary
    public PizzeriaDalmatino pizzeriaDalmatino(){
        return  new PizzeriaDalmatino();
        }
    


}
