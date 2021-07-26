package com.agency04.sbss.pizza;

public class PizzeriaGirasole implements PizzeriaService{

    @Override
    public String getName(Pizza pPizza) {
        return "Girasole";
    }

    @Override
    public String getAddress(Pizza pPizza) {
        return "Kralja Zvonimira 3";
    }

    @Override
    public String makePizza(Pizza pPizza) {
        return "daj tu picu";
    }
}
