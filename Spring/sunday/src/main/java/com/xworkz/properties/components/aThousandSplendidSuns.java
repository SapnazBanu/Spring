package com.xworkz.properties.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@PropertySource("classpath:app.properties")
@Component
public class aThousandSplendidSuns {

    @Value("${dbusername}")
    private String dbusername;
    @Value("${dbpassword}")
    private String dbpassword;
    @PostConstruct
    public void properties() {
        System.out.println(this.dbusername);
        System.out.println(this.dbpassword);
    }


    public aThousandSplendidSuns()
    {
        System.out.println("aThousandSplendidSuns created");
    }
}
