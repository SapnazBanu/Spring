package com.xworkz.prio.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Team {
    @Autowired
    private String teamName;

    public Team()
    {
        System.out.println("Team created");
    }


}
