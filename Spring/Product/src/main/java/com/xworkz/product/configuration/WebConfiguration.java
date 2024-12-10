package com.xworkz.product.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xworkz.product")
@Configuration
public class WebConfiguration {
    public WebConfiguration()
    {
        System.out.println("WebConfiguration created");
    }
}
