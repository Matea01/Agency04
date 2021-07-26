package com.agency04.sbss.pizza;

public class PizzaDiavola extends Pizza implements PizzaInt {
    @Override
    public String getName() {
        return "Pizza Diavola";
    }

    @Override
    public String getIngredients() {
        return "Tomato sauce, mozzarella, spicy salami, and chilli pepper";
    }
}
