package com.http418.spring.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // or @Scope("prototype")
public class PersonDAO {

    private Logger log = LoggerFactory.getLogger(PersonDAO.class);

    @Autowired
    JdbcConnection jdbcConnection;

    @PostConstruct // if you want to do something to initialize the content of the bean as soon as the dependenies are
    // available yo use the @PostConstruct annotation
    public void postConstruct(){
        log.info("postConstruct");

        /* 2018-03-21 23:04:51.239 DEBUG 8308 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor :
            Autowiring by type from bean name 'personDAO' to bean named 'jdbcConnection'
        2018-03-21 23:04:51.240 DEBUG 8308 --- [           main] .s.c.a.CommonAnnotationBeanPostProcessor :
            Invoking init method on bean 'personDAO': public void com.http418.spring.lifecycle.PersonDAO.postConstruct()
        2018-03-21 23:04:51.240  INFO 8308 --- [           main] com.http418.spring.lifecycle.PersonDAO   :
            postConstruct
        2018-03-21 23:04:51.240 DEBUG 8308 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     :
            Finished creating instance of bean 'personDAO' */
    }

    @PreDestroy
    public void preDestroy(){
        log.info("preDestroy");

        /* 2018-03-21 23:12:02.930  INFO 6412 --- [       Thread-3] o.s.j.e.a.AnnotationMBeanExporter        :
            Unregistering JMX-exposed beans on shutdown
        2018-03-21 23:12:02.930 DEBUG 6412 --- [       Thread-3] .s.c.a.CommonAnnotationBeanPostProcessor :
            Invoking destroy method on bean 'personDAO': public void com.http418.spring.lifecycle.PersonDAO.preDestroy()
        2018-03-21 23:12:02.930  INFO 6412 --- [       Thread-3] com.http418.spring.lifecycle.PersonDAO   :
            preDestroy
        2018-03-21 23:12:02.930 DEBUG 6412 --- [       Thread-3] o.s.b.f.s.DefaultListableBeanFactory     :
            Retrieved dependent beans for bean 'org.springframework.boot.autoconfigure.internalCachingMetadataReaderFactory': [org.springframework.context.annotation.internalConfigurationAnnotationProcessor]
        Process finished with exit code 0 */

        /* The PreDestroy annotation is used on methods as a callback notification to
         * signal that the instance is in the process of being removed by the
         * container. The method annotated with PreDestroy is typically used to
         * release resources that it has been holding. This annotation MUST be
         * supported by all container managed objects that support PostConstruct
         * except the application client container in Java EE 5. */
    }
}
