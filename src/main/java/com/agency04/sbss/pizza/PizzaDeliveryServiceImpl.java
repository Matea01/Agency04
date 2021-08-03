package com.agency04.sbss.pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component(value="pizzaDeliveryServiceImpl")
public class PizzaDeliveryServiceImpl implements PizzaDeliveryService{

    @Autowired//znaci cim se kreira PizzaDelImpl bean da ce se pozvati njen konstruktor
    @Qualifier("pizzeriaDalmatino") private PizzeriaService pizzeriaService;


    //@PostConstruct
    //public void DoMyStartUpStuff()
    //{
      //  System.out.println("inside DoMyStartUpStuff");
    //}
    //@PreDestroy
    //public void DoMyCleadnUp()
    //{
       // System.out.print("Inside DoMyCleanUp");
    //}

    @Override
    public String orderPizza(Pizza pizza) {
        return "Naručili ste pizzu "+ pizza.getName();
    }
}
