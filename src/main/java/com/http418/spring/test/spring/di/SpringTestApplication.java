package com.http418.spring.test.spring.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringTestApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(SpringTestApplication.class, args);
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

        int result =
                binarySearch.binarySearch(new int[] {12, 4, 6}, 3);

        System.out.println(result);
    }
}
