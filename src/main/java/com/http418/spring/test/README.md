#### Module: test
In this module we describe the basic concepts of Unity Testing. The topics are:
* Junit
    * src/main/java/com/http418/spring/test/junit
    * src/test/java/com/http418/spring/test/junit
* Integration of Mockito and Junit
    * src/main/java/com/http418/spring/test/mockito
    * src/test/java/com/http418/spring/test/mockito
* Integration of Spring, Junit and Mockito
    * src/main/java/com/http418/spring/test/spring
    * src/test/java/com/http418/spring/test/spring

1. Junit and Mockito directories, both have a **compare** package. They will demonstrate the same 
scenario, however, different configurations.
2. This module has 2 directories:
    * src/main/java/com/http418/spring/test
    * src/test/java/com/http418/spring/test
3. The dependencies used are:
```
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-test</artifactId>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.mockito</groupId>
        <artifactId>mockito-core</artifactId>
        <scope>test</scope>
    </dependency>
```
> The packages at the src/main/java and src/main/resources are the same at /src/test/java
src/test/resources

    
#### Source
* [Baeldung - Migrating from JUnit 4 to JUnit 5](http://www.baeldung.com/junit-5-migration)

 