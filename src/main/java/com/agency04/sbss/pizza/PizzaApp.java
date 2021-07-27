package com.agency04.sbss.pizza;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        Pizza thePizza = context.getBean("myPizza", Pizza.class);

        System.out.println(thePizza.getName());
        System.out.println(thePizza.getIngredients());


        context.close();
        // Add some pizza code

    }

}
