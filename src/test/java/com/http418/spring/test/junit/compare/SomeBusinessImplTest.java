package com.http418.spring.test.junit.compare;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SomeBusinessImplTest {

    SomeBusinessImpl bImpl = new SomeBusinessImpl(new DataServiceStub());

    @Test
    public void findTheGreatestFromAllData() {
        int result = bImpl.findTheGreatestFromAllData();
        assertEquals(24, result);
    }
}

class DataServiceStub implements DataService{
    @Override
    public int[] retrieveAllData() {
        return new int[]{24,6,15};
    }
}
