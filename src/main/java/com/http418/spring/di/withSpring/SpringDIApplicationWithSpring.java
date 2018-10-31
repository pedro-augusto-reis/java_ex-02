package com.http418.spring.di.withSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDIApplicationWithSpring {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(SpringDIApplicationWithSpring.class, args);
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

        int result =
                binarySearch.binarySearch(new int[] {12, 4, 6}, 3);

        System.out.println(result);
    }

    // WHAT ARE BEANS?
        // add the annotation @Component at the beginning of BinarySearchImpl class will tell to Spring that the class is a BEAN
        // the annotation will tell Spring to manage that class
        // the bean is storage at APPLICATION CONTEXT
        // to use a bean, you need to get it from the APPLICATION CONTEXT
    // WHAT ARE THE DEPENDENCIES OF A BEAN?
        // sortAlgorithm is a dependency of BinarySearchImpl
        // to tell Spring that sortAlgorithm is a dependency you use the annotation @Autowired
        // when you annotate the sortAlgorithm you tells that BinarySearchImpl depends on sortAlgorithm
    // WHERE TO SEARCH FOR BEANS?
        // use the annotation @ComponentScan to specify the package where Spring will look for BEANS
        // SpringBoot, by default, will search for the BEANS at the same package
        // it will search at com.http418.spring.basics
        // if not using SpringBoot, you should use @ComponentScan("com.http418.spring.basics")

    // DIFFERENCE BETWEEN Application Context and Bean Factory
        /*
        Because the ApplicationContext includes all functionality of the BeanFactory, it is generally recommended over
        the BeanFactory, except for a few situations such as in embedded applications running on resource-constrained
        devices where memory consumption might be critical and a few extra kilobytes might make a difference.
         */
}
