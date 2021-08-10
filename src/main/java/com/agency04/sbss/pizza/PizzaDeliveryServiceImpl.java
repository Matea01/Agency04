package com.agency04.sbss.pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Component(value="pizzaDeliveryServiceImpl")
public class PizzaDeliveryServiceImpl implements PizzaDeliveryService{

    @Autowired
    private PizzeriaService pizzeriaService;


    @PostConstruct
    public void DoMyStartUpStuff()
    {
       System.out.println("inside DoMyStartUpStuff");
    }
    @PreDestroy
    public void DoMyCleadnUp()
    {
        System.out.print("Inside DoMyCleanUp");
    }

    @Override
    public String orderPizza(Pizza pizza) {
        return "Naručili ste pizzu "+ pizza.getName();
    }
}
