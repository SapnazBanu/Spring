package com.xworkz.properties.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KiteRunner {

    @Autowired
    public String authorName;
    public KiteRunner()
    {
        System.out.println("KiteRunner created");
    }
}
