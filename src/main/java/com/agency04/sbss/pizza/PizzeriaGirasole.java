package com.agency04.sbss.pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component(value="pizzeriaGirasole")
public class PizzeriaGirasole implements PizzeriaService{


    private String name="Pizzeria Girasole";
    private String address="Kralja Zvonimira 3";


    public PizzeriaGirasole(){
        System.out.println("inside no-args constructor of Dalmatino");

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
         return getName()+"priprema pizzu"+pizza.getName();
    }


}
