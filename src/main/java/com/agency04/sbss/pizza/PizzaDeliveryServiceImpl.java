package com.agency04.sbss.pizza;

import org.springframework.stereotype.Component;

@Component
public class PizzaDeliveryServiceImpl implements PizzaDeliveryService{

    //dependency injection

    private PizzeriaGirasole pizzeriaGirrasole;//constructor njection
    private PizzeriaDalmatino pizzeriaDallmatino;//setter injection

    //constructor injection
    public PizzaDeliveryServiceImpl(PizzeriaGirasole pizzeriaGirasole){
        this.pizzeriaGirrasole=pizzeriaGirasole;
    };

    //setter injection
    public void setPizzeriaDalmatino(PizzeriaDalmatino pizzeriaDalmatino){
        this.pizzeriaDallmatino=pizzeriaDalmatino;
    };

    public PizzaDeliveryServiceImpl() {
    }

    //vidis da imas pristup metodama injectane klase
    @Override
    public String orderPizza(Pizza pizza) {
        return "aaaaaaaaaaaaaaaaaaaaaaa";
    }
}
