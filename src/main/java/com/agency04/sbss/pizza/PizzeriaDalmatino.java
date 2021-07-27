package com.agency04.sbss.pizza;

public class PizzeriaDalmatino implements PizzeriaService{

    private PizzaDeliveryService pizzaDeliveryService;
    private PizzeriaService pizzeriaService;

    public PizzeriaDalmatino(){
        System.out.println("inside no-args constructor");
       //System.out.println(getName());
       // System.out.println(getAddress());
    }

    public void setMyPizzeriaDalmatinoDelivery(PizzaDeliveryServiceImpl myPizzeriaDalmatinoDelivery) {
        System.out.println("PizzeriaDalatino postavljena setter metodom-setPizzeriaService");
        this.pizzaDeliveryService=myPizzeriaDalmatinoDelivery;
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
        return "ja ocu tu i tu picu";
    }


}
