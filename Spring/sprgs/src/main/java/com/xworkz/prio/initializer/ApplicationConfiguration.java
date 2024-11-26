package com.xworkz.prio.initializer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@ComponentScan("com.xworkz.prio")
@Configuration
public class ApplicationConfiguration {

    public ApplicationConfiguration()
    {
        System.out.println("Running configuration class");
    }
    @Bean
    public String teamName()
    {
        return "RCB";
    }

    @Bean
    public Double budget()
    {
        return 100d;
    }

    @Bean
    public String ownerName()
    {
        return "United Spirits";
    }

    @Bean
    public Double batCost()
    {
        return 5000d;
    }

    @Bean
    public Double ballCost()
    {
        return 500d;
    }
}


