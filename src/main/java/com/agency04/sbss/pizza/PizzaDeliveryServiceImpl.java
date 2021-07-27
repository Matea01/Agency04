package com.agency04.sbss.pizza;

public class PizzaDeliveryServiceImpl implements PizzaDeliveryService{

    //dependency injection

    private PizzeriaGirasole pizzeriaGirrasole;//constructor njection
    private PizzeriaDalmatino pizzeriaDallmatino;//setter injection

    //constructor injection
    public PizzaDeliveryServiceImpl(PizzeriaGirasole pizzeriaGirasole){
        pizzeriaGirrasole=pizzeriaGirasole;
    };

    //setter injection
    public void setPizzeriaDalmatino(PizzeriaDalmatino pizzeriaDalmatino){
        this.pizzeriaDallmatino=pizzeriaDalmatino;
    };

    public PizzaDeliveryServiceImpl() {
    }

    @Override
    public String orderPizza() {
        return "Narudžba je zaprimljena gladniče.";
    }
}
