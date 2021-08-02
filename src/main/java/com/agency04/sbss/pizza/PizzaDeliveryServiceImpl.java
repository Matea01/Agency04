package com.agency04.sbss.pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component(value="pizzaDeliveryServiceImpl")
public class PizzaDeliveryServiceImpl implements PizzaDeliveryService{



    @Autowired
    @Qualifier("pizzeriaDalmatino") private PizzeriaService pizzeriaService;

    

    @PostConstruct
    public void DoMyStartUpStuff()
    {
        System.out.println("inside DoMyStartUpStuff");
    }
    public void DoMyCleadnUp()
    {
        System.out.print("Inside DoMyCleanUp");
    }

    //vidis da imas pristup metodama injectane klase
    @Override
    public String orderPizza(Pizza pizza) {
        return "Naručili ste pizzu "+ pizza.getName();
    }
}
