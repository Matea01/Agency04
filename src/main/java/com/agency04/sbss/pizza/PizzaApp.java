package com.agency04.sbss.pizza;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaApp {

    public static void main(String[] args) {

        //load the spring configuration#1
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        //retrieve the bean from config file->default bean(small first letter class name)
        PizzaDeliveryService thePizza = context.getBean("pizzaDeliveryServiceImpl", PizzaDeliveryService.class);
        System.out.println(thePizza.orderPizza(new PizzaVege()));
        System.out.println(thePizza.orderPizza(new PizzaCheese()));


        context.close();
        // Add some pizza code

    }

}
