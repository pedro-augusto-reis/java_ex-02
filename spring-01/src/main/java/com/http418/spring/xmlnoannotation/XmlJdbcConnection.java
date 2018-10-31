package com.http418.spring.xmlnoannotation;

//@Component
//@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class XmlJdbcConnection {

    //@Autowired
    public XmlJdbcConnection() {
        System.out.println("JDBC Connection");
    }


}
