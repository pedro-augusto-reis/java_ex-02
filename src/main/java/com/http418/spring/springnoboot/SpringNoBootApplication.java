package com.http418.spring.springnoboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // Indicates that a class declares one or more @Bean methods and may be processed by the
               // Spring container to generate bean definitions and service requests for those beans at runtime
/*
"This annotation is used on classes that define beans. @Configuration is an analog for an XML configuration file – it is
configuration using Java classes. A Java class annotated with @Configuration is a configuration by itself and will have
methods to instantiate and configure the dependencies."
*/
@ComponentScan // by default it will search the base package where the class is
public class SpringNoBootApplication {

    private static Logger log = LoggerFactory.getLogger(SpringNoBootApplication.class);

    public static void main(String[] args) {

        // Old one: ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDIApplicationWithSpring.class, args);
        // ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringNoBootApplication.class);
        // ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringNoBootApplication.class);
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringNoBootApplication.class);
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

        int result =
                binarySearch.binarySearch(new int[] {12, 4, 6}, 3);

        log.info(" MENSAGEM LOG: {}", result);

        //((AnnotationConfigApplicationContext) applicationContext).close();
        //applicationContext.close();
        applicationContext.registerShutdownHook();

        /*
        "By default the ApplicationContext does not have a shutdown hook and does not have any exposed methods to configure
        this. These methods are all encapsulated in the ConfigurableApplicationContext. This interface exposes a couple
        of extra configuration and lifecycle management methods like close(); and registerShutdownHook();. When you call
        the registerShutdownHook() method, this registers a shutdown hook with the JVM and ensures a graceful shutdown
        and calls the relevant destroy methods on your singleton beans."
         */
    }

}
