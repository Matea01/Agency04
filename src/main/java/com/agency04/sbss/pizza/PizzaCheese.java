package com.agency04.sbss.pizza;

public class PizzaCheese implements Pizza {

    //private fields
    private PizzaDeliveryService pizzaDeliveryService;
    private PizzeriaService pizzeriaService;


    //constructor for dependency injction
    public PizzaCheese(PizzaDeliveryService thePizzaDeliveryService){

        pizzaDeliveryService = thePizzaDeliveryService;
    }

    public PizzaCheese(PizzeriaService thePizzeriaService){

        pizzeriaService = thePizzeriaService;
    }


    public PizzaCheese(){
    System.out.println("PizzaCheese je narucena");
    }

    //ovo mi je javljalo grešku da s etreba generirati konstruktor(prijedlog mi je dalo) pa sam izgenerirala.
    // Ne znam je li ovo ok?
    public PizzaCheese(PizzaDeliveryServiceImpl pizzaDeliveryService) {
    }


    @Override
    public String getName(){
    return "pizza siiir";
    }
    @Override
    public String getIngredients(){
    return "samo siiir";
    }

    @Override
    public String getAddress() {
        return "adresa pizza cheese";
    }
}
