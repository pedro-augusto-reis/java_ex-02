package com.http418.spring.propertie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
// we want to load the someExternalServiceExample.properties
//@PropertySource("file:D:\\ti\\someExternalServiceExample.properties") for file outside your project
@PropertySource("classpath:someExternalServiceExample.properties")
public class SpringExternalServiceApplication {

    private static Logger log = LoggerFactory.getLogger(SpringExternalServiceApplication.class);

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringExternalServiceApplication.class);
        SomeExternalService externalService = applicationContext.getBean(SomeExternalService.class);

        log.info("MENSAGEM LOG > {}", externalService.serviceURL());

        applicationContext.registerShutdownHook();

    }

}
