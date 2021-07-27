package com.agency04.sbss.pizza;

public class PizzeriaGirasole implements PizzeriaService{

    @Override
    public String getName(Pizza pPizza) {
        return pPizza.getName();
    }

    @Override
    public String getAddress(Pizza pPizza) {
        return pPizza.getAddress();
    }

    @Override
    public String makePizza(Pizza pPizza) {
        return "daj tu picu";
    }
}
