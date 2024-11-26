package com.xworkz.prio.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Stadium {

    @Autowired
    private Double budget;

    public Stadium()
    {
        System.out.println("Stadium Created");
    }


}
