package com.agency04.sbss.pizza;

public class PizzaApp {

    public static void main(String[] args) {
        // Add some pizza code
        Pizza Diavola = new PizzaDiavola();

        Pizza Fontana= new PizzaFontana();

        Pizza Schiacciata = new PizzaSchiacciata();

        System.out.println(Diavola.getName()+":\t sastojci pizze:" +Diavola.getIngredients());
        System.out.println(Fontana.getName()+ ":\t sastojci pizze:"+Fontana.getIngredients());
        System.out.println(Schiacciata.getName()+ ":\t sastojci pizze:"+ Schiacciata.getIngredients());


    }

}
