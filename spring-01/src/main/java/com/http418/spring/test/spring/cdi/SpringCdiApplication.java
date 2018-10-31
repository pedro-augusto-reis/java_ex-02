package com.http418.spring.test.spring.cdi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringCdiApplication {

    private static Logger log = LoggerFactory.getLogger(SpringCdiApplication.class);

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(SpringCdiApplication.class, args);

        SomeCdiBusiness someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);

        log.info("business: {} dao: {}", someCdiBusiness, someCdiBusiness.getSomeCdiDao());

    }
}
