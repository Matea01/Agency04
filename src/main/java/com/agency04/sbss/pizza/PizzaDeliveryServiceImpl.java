package com.agency04.sbss.pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component(value="pizzaDeliveryServiceImpl")
public class PizzaDeliveryServiceImpl implements PizzaDeliveryService{



    @Autowired
    //dependency injection
    private PizzeriaGirasole pizzeriaGirrasole;//constructor njection
    private PizzeriaDalmatino pizzeriaDallmatino;//setter injection



    //constructor injection
    public PizzaDeliveryServiceImpl(PizzeriaGirasole pizzeriaGirasole){

        this.pizzeriaGirrasole=pizzeriaGirasole;
    };
    public void setPizzeriaDalmatino(PizzeriaDalmatino pizzeriaDalmatino){
        this.pizzeriaDallmatino=pizzeriaDalmatino;
    };

    public PizzaDeliveryServiceImpl() {
    }

    //vidis da imas pristup metodama injectane klase
    @Override
    public String orderPizza(Pizza pizza) {
        return "Naručili ste pizzu "+ pizza.getName();
    }
}
