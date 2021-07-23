package com.agency04.sbss.pizza;

public class PizzaApp {

    public static void main(String[] args) {
        // Add some pizza code
        PizzaInt PizzaDiavlola = new PizzaDiavola();

        PizzaInt PizzaFontana= new PizzaFontana();

        PizzaInt PizzaSchiacciata= new PizzaSchiacciata();

        System.out.println(PizzaDiavlola.getName());
        System.out.println(PizzaDiavlola.getIngredients());

        System.out.println(PizzaFontana.getName());
        System.out.println(PizzaFontana.getIngredients());

        System.out.println(PizzaSchiacciata.getName());
        System.out.println(PizzaSchiacciata.getIngredients());


    }

}
