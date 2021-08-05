package com.agency04.sbss.pizza;

import org.springframework.stereotype.Service;

@Service
public interface PizzeriaService {

    String getName();
    String getAddress();
    String makePizza(Pizza pizza);



}
