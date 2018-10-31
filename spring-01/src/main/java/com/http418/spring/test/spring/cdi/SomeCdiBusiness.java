package com.http418.spring.test.spring.cdi;

import javax.inject.Inject;
import javax.inject.Named;

//@Component
@Named // CDI annotation
public class SomeCdiBusiness {

    //@Autowired
    @Inject // CDI annotation
            SomeCdiDao someCdiDao;

    public SomeCdiDao getSomeCdiDao() {
        return someCdiDao;
    }

    public void setSomeCdiDao(SomeCdiDao someCdiDao) {
        this.someCdiDao = someCdiDao;
    }

    public int findGreatest(){
        int greatest = Integer.MIN_VALUE;
        int [] data = someCdiDao.getData();
        for (int value : data) {
            if (value > greatest){
                greatest = value;
            }
        }
        return greatest;
    }
}
