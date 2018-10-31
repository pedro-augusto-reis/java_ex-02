package com.http418.spring.componentscan.a;

import com.http418.spring.componentscan.b.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.http418.spring.componentscan.b") // comment for fail example
public class ComponentScanApplication {

    private static Logger LOG = LoggerFactory.getLogger(ComponentScanApplication.class);

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(ComponentScanApplication.class, args);

        ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

        LOG.info("{}", componentDAO);

        // 1. when you execute the application and the log shows NoSuchBeanDefinition you:
            // 1.1. check if the class has a component annotation
        // 2. when you specify a @SpringBootApplication annotation, you, automatically, is specifying to search class under the annotated class package
            // exemple: in this case (ComponentScanApplication), the annotation @SpringBootApplication you scan for beans at com.http418.spring.componentscan package
                // It is like it's implementing: @ComponentScan("com.http418.spring.componentscan")
        // 3. if you need to search for beans that are outside from the package containung @SpringBootApplication, or the main Spring class,
        // you need to use @ComponentScan("package.that.you.want")
    }

}
