package com.agency04.sbss.pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;



public class PizzeriaDalmatino implements PizzeriaService{



    @Value("$dalmatino.name")
    private String name;
    @Value("$dalmatino.adress")
    private String address;


    public PizzeriaDalmatino(){
        System.out.println("inside no-args constructor of Dalmatino");
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String makePizza(Pizza pizza) {
        return getName()+"priprema pizzu"+pizza.getName();
    }


}
