package com.agency04.sbss.pizza;

public class PizzaFontana extends Pizza implements PizzaInt{
    @Override
    public String getName() {
        return "Pizza Fontana";
    }

    @Override
    public String getIngredients() {
        return "Tomato sauce, mozzarella, gorgonzola cheese, radicchio, and parmesan";
    }
}
