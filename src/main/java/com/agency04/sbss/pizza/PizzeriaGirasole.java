package com.agency04.sbss.pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class PizzeriaGirasole implements PizzeriaService{


    private PizzaDeliveryService pizzaDeliveryService;
    private PizzeriaService pizzeriaService;

    private String name="Pizzeria Girasole";
    private String address="Kralja Zvonimira 3";


    public PizzeriaGirasole(){
        System.out.println("inside no-args constructor");

    }
    @Autowired
    public PizzeriaGirasole(PizzaDeliveryServiceImpl pizzaDeliveryService) {
        this.pizzaDeliveryService=pizzaDeliveryService;
    }

    @Override
    public String getName(Pizza pizza) {
        return name;
    }

    @Override
    public String getAddress(Pizza pizza) {
        return address;
    }

    @Override
    public String makePizza(Pizza pizza) {
        return "U pripremi je" +pizza.getName();
    }


}
