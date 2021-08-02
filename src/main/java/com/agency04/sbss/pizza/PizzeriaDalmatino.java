package com.agency04.sbss.pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PizzeriaDalmatino implements PizzeriaService{



    private PizzaDeliveryService pizzaDeliveryService;




    private String name="Pizzeria Dalmatino";
    private String address="Put Supavla 1";


    public PizzeriaDalmatino(){
        System.out.println("inside no-args constructor of Dalmatino");
    }

    public void setMyPizzeriaDalmatinoDelivery(PizzaDeliveryServiceImpl myPizzeriaDalmatinoDelivery) {
        this.pizzaDeliveryService=myPizzeriaDalmatinoDelivery;
    }



    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String makePizza(Pizza pizza) {
        return "U pripremi je:" + pizza.getName();
    }


}
