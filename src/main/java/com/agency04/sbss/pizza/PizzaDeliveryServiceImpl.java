package com.agency04.sbss.pizza;

public class PizzaDeliveryServiceImpl implements PizzaDeliveryService{

    public PizzaDeliveryServiceImpl(PizzaDeliveryServiceImpl pizzaDeliveryService) {
    }

    @Override
    public String orderPizza() {
        return "Narudžba je zaprimljena gladniče.";
    }
}
