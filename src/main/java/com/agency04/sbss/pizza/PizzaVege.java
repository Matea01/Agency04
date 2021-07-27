package com.agency04.sbss.pizza;

public class PizzaVege implements Pizza {

    //private fields
    private PizzaDeliveryService pizzaDeliveryService;
    private PizzeriaService pizzeriaService;

    //no-arg constructor
    public PizzaVege(){
        System.out.println("inside no-args constructor");
        System.out.println(getName());
        System.out.println(getIngredients());
        System.out.println(getAddress());
    }
    //create setter methos gor injection


    public void setPizzaDeliveryService(PizzaDeliveryService pizzaDeliveryService) {
        System.out.println("PizzaVege postavljena setter metodom-setPizzeriaService");
        this.pizzaDeliveryService = pizzaDeliveryService;
    }

    public void setPizzeriaService(PizzeriaService pizzeriaService) {

        this.pizzeriaService = pizzeriaService;
    }

    //ovveride methods
    @Override
    public String getName() {
        return "pizza vege";
    }

    @Override
    public String getIngredients() {
        return "samo zeleno";
    }

    @Override
    public String getAddress() {
        return "Adresa Vege put 31";
    }




}
