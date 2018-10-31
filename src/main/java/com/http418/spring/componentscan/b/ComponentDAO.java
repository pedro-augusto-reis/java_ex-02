package com.http418.spring.componentscan.b;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // or @Scope("prototype")
public class ComponentDAO {

    @Autowired
    ComponentJdbcConnection componentJdbcConnection;

    public ComponentJdbcConnection getComponentJdbcConnection() {
        return componentJdbcConnection;
    }

    public void setComponentJdbcConnection(ComponentJdbcConnection componentJdbcConnection) {
        this.componentJdbcConnection = componentJdbcConnection;
    }
}
