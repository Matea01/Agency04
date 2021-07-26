package com.agency04.sbss.pizza;

public class PizzaCheese implements Pizza {

    private PizzaDeliveryService pizzaDeliveryService;
    private PizzeriaService pizzeriaService;

    public PizzaCheese(PizzaDeliveryService thePizzaDeliveryService){
        pizzaDeliveryService = thePizzaDeliveryService;
    }

    public PizzaCheese(PizzeriaService thePizzeriaService){
        pizzeriaService = thePizzeriaService;
    }



    public PizzaCheese() {

    }

    @Override
    public String getName(){
    return "Pizaaa";
    }
    @Override
    public String getIngredients(){
    return "sir";
    }

    @Override
    public String getDailyPizza() {
        return pizzaDeliveryService.orderPizza();
    }
}
