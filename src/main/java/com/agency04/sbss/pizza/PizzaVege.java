package com.agency04.sbss.pizza;

public class PizzaVege implements Pizza {

    private PizzaDeliveryService pizzaDeliveryService;
    private PizzeriaService pizzeriaService;

    public PizzaVege(PizzaDeliveryService thePizzaDeliveryService){
        pizzaDeliveryService = thePizzaDeliveryService;
    }

    public PizzaVege(PizzeriaService thePizzeriaService){
        pizzeriaService = thePizzeriaService;
    }

    //konstruktor

    public PizzaVege(){

    }


    //ovveride methods
    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getIngredients() {
        return null;
    }

    @Override
    public String getAddress() {
        return null;
    }




}
