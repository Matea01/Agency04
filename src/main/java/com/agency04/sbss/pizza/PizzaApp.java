package com.agency04.sbss.pizza;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaApp {

    public static void main(String[] args) {

        //load the spring configuration#1
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        //retrieve the bean from config file
        Pizza thePizza = context.getBean("myPizza", Pizza.class);
        System.out.println(thePizza.getName());
        System.out.println(thePizza.getIngredients());
        System.out.println(thePizza.getAddress());




        context.close();

        //load the spring configuration#2
        //ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("spring-context.xml");
        //retrieve the bean from config file
        //Pizza thePizzaVege = context1.getBean("myPizzaVege", Pizza.class);

        //call the mthods on the bean

        //close context
       // context1.close();

        // Add some pizza code

    }

}
