package com.http418.spring.xmlnoannotation;


//@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // or @Scope("prototype")
public class XmlPersonDAO {

    //@Autowired
    XmlJdbcConnection XmlJdbcConnection;

    public XmlJdbcConnection getXmlJdbcConnection() {
        return XmlJdbcConnection;
    }

    public void setXmlJdbcConnection(XmlJdbcConnection xmlJdbcConnection) {
        this.XmlJdbcConnection = xmlJdbcConnection;
    }
}
