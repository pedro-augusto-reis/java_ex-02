package com.http418.spring.test.mockito.compare;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessImplTest {

    DataService dataServiceMock = mock(DataService.class);
    SomeBusinessImpl bImpl = new SomeBusinessImpl(dataServiceMock);

    @Test
    public void findTheGreatestFromAllData() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{24,15,3});

        int result = bImpl.findTheGreatestFromAllData();
        assertEquals(24, result);
    }

    @Test
    public void findTheGreatestFromAllData_MoreValue() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{24,15,3,6,987,5,98,42,4,654,2,81,8546,2});

        int result = bImpl.findTheGreatestFromAllData();
        assertEquals(24, result);
    }
}
