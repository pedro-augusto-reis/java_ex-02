package com.http418.spring.propertie;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {

    // will get the value from propertie file
        // src\main\resources\someExternalServiceExample.properties
    @Value("${external.service.url}")
    private String url;

    public String serviceURL(){
        return url;
    }
}
