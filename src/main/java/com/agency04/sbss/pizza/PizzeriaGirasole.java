package com.agency04.sbss.pizza;

public class PizzeriaGirasole implements PizzeriaService{

    private PizzaDeliveryService pizzaDeliveryService;
    private PizzeriaService pizzeriaService;
    private String name="Pizzeria Girasole";
    private String address="Kralja Zvonimira 3";


    public PizzeriaGirasole(){
        System.out.println("inside no-args constructor");

    }

    public PizzeriaGirasole(PizzaDeliveryServiceImpl pizzaDeliveryService) {
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
