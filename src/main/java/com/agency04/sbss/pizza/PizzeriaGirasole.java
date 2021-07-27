package com.agency04.sbss.pizza;

public class PizzeriaGirasole implements PizzeriaService{


    public PizzeriaGirasole(PizzaDeliveryServiceImpl pizzaDeliveryService) {
    }

    @Override
    public String getName(Pizza pizza) {
        return pizza.getName();
    }

    @Override
    public String getAddress(Pizza pizza) {
        return pizza.getAddress();
    }

    @Override
    public String makePizza(Pizza pizza) {
        return "daj tu pizzu";
    }


}
