package com.agency04.sbss.pizza;

public class PizzaSchiacciata extends Pizza implements PizzaInt{
    @Override
    public String getName() {
        return "Pizza Schiacciata";
    }

    @Override
    public String getIngredients() {
        return "Olive oil and rosemary";
    }
}
