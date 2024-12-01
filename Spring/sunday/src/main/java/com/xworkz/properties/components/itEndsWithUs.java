package com.xworkz.properties.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class itEndsWithUs {
    @Autowired
    public Integer publishedYear;
    public itEndsWithUs(){
        System.out.println("itEndsWithUs");
    }
}
