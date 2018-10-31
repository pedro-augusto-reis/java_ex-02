#### Module: Spring without Spring-Boot
In this module we need to make some changes in the pom.xml file.  
Three new dependencies are specified:
```
    <!-- bean factory needs spring-core -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-core</artifactId>
    </dependency>
    
    <!-- application context -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
    </dependency>
    
    <!-- dependency needed for log implementation
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-api</artifactId>
    </dependency>
    <dependency>
        <groupId>ch.qos.logback</groupId>
        <artifactId>logback-classic</artifactId>
    </dependency>
```    
Note that the dependency:
```
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter</artifactId>
    </dependency>
```    
Contains all the other three dependencies.

#### Source
* [@Configuration](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Configuration.html)
* [DZone  Java Zone - A Guide to Spring Framework Annotations](https://dzone.com/articles/a-guide-to-spring-framework-annotations)
* [StackOverflow - How correctly close the ApplicationContext in Spring](https://stackoverflow.com/questions/29169916/how-correctly-close-the-applicationcontext-in-spring?rq=1)
* [memorynotfound - Gracefully Shutdown Spring Application Container](https://memorynotfound.com/gracefully-shutdown-spring-application-container/)
