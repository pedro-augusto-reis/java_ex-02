package com.http418.spring.xmlnoannotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlApplication {

    private static Logger log = LoggerFactory.getLogger(SpringXmlApplication.class);

    public static void main(String[] args) {

        // by default, if you created the applicationContext.xml in the root of resources directory, it is not needed to specify the complete path, only the file name
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // when you log this way, the {} will show only the first value of an array.
        // to solve this, do a CAST.
        log.info("Beans Loaded > {}", (Object)applicationContext.getBeanDefinitionNames());

        XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);

        log.info("MENSAGEM LOG > xmlPersonDAO: {} - xmlPersonDAO.info: {}", xmlPersonDAO, xmlPersonDAO.getXmlJdbcConnection());


    }
}
