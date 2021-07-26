package com.agency04.sbss.pizza;

public class PizzeriaServiceImpl implements PizzeriaService{
    @Override
    public String getName(Pizza pPizza) {
        return "ime Restorana";
    }

    @Override
    public String getAddress(Pizza pPizza) {
        return "adresa restorana";
    }

    @Override
    public String makePizza(Pizza pPizza) {
        return "ja ocu tu i tu picu";
    }
}
