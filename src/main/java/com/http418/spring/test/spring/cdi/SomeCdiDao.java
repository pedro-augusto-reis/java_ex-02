package com.http418.spring.test.spring.cdi;

import javax.inject.Named;

//@Component
@Named // CDI annotation
public class SomeCdiDao {

    public int[] getData(){
        return new int[]{5,89,100};
    }
}
