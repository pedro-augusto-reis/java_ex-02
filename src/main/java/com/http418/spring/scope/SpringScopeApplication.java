package com.http418.spring.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringScopeApplication {

    private static Logger log = LoggerFactory.getLogger(SpringScopeApplication.class);

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(SpringScopeApplication.class, args);

        PersonDAO personDAO01 = applicationContext.getBean(PersonDAO.class);
        PersonDAO personDAO02 = applicationContext.getBean(PersonDAO.class);

        // will print the hash from bean
        // if no scope is informed, the hashs will be the same (you will get the same bean)
        log.info("personDAO - 01 hash: " + personDAO01);
        log.info("{}", personDAO01.getJdbcConnection());
        log.info("{}", personDAO01.getJdbcConnection()); // even for the same instance, the proxy will get a new object of JdbcConnection

        log.info("personDAO - 02 hash: " + personDAO02);
        log.info("{}", personDAO02.getJdbcConnection());

    }
    // CASE 01
        // when you have singleton scope for PersonDAO and prototype for JdbcConnection, the hash value from the differents instances
        // from PersonDAO will be the same. However, even if you have added PROTOTYPE to JdbcConnection, the hash from them are the same.
        // in this case you need to use proxy
            // @Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
                // https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/context/annotation/ScopedProxyMode.html

    // BEAN SCOPE
        // singleton (default): one instance per spring context
            // when you try to get differents instances of personDAO from APPLICATION CONTEXT, you are getting the same bean
            // personDAO01 and personDAO02 are refering to the same object
        // prototype: new bean whenever requested
            // to change the SCOPE for an specific BEAN, add the @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) or @Scope("prototype")

    /* Spring’s concept of a singleton bean differs from the Singleton pattern as defined in the Gang of Four (GoF) patterns book.
    The GoF Singleton hard-codes the scope of an object such that one and only one instance of a particular class is created per ClassLoader.
    The scope of the Spring singleton is best described as per container and per bean.
    This means that if you define one bean for a particular class in a single Spring container,
    then the Spring container creates one and only one instance of the class defined by that bean definition. */
}
