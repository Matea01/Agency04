package com.agency04.sbss.pizza;

public class PizzeriaDalmatino implements PizzeriaService{
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
