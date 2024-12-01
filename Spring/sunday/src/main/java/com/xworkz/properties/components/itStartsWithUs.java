package com.xworkz.properties.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class itStartsWithUs {
    @Autowired
    public String genere;
    public itStartsWithUs()
    {
        System.out.println("itStartsWithUs created");
    }

}
