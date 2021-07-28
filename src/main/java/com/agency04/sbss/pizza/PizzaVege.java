package com.agency04.sbss.pizza;

public class PizzaVege implements Pizza {

    public String name="Pizza Vege";
    public String sastojci="Only vege";

    //ovveride methods
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getIngredients() {
        return sastojci;
    }





}
