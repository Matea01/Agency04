package com.agency04.sbss.pizza;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class PizzaApp {

    public static void main(String[] args) {

        //load the spring configuration#1
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PizzaConfig.class);
        //retrieve the bean from config file->default bean(small first letter class name)
        PizzaDeliveryService thePizza = context.getBean("pizzaDeliveryServiceImpl", PizzaDeliveryService.class);

        System.out.println(thePizza.orderPizza(new PizzaVege()));
        System.out.println(thePizza.orderPizza(new PizzaCheese()));



        context.close();
        // Add some pizza code

    }

}
