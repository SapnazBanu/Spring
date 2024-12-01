package com.xworkz.properties.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xworkz.properties")
@Configuration
public class AppConfig {

    public AppConfig()
    {
        System.out.println("Running configuration class");
    }

    @Bean

    public String authorName()
    {
        return ("Khaled Hosseini");
    }
    @Bean
    public double cost()
    {
        return 500d;
    }
    @Bean
    public Integer publishedYear()
    {
        return 2003;
    }
    @Bean
    public String genere()
    {
        return ("HistoricalFiction");
    }
}
