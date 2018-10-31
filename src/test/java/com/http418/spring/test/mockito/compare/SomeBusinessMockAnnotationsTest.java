package com.http418.spring.test.mockito.compare;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotationsTest {

    // DataService dataServiceMock = mock(DataService.class);
    @Mock
    DataService dataServiceMock;

    // SomeBusinessImpl bImpl = new SomeBusinessImpl(dataServiceMock);
    @InjectMocks
    SomeBusinessImpl bImpl;

    @Test
    public void findTheGreatestFromAllData() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{24,15,3});
        assertEquals(24, bImpl.findTheGreatestFromAllData());
    }

    @Test
    public void findTheGreatestFromAllData_MoreValues() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{24,15,3,6,987,5,98,42,4,654,2,81,8546,2});
        assertEquals(24, bImpl.findTheGreatestFromAllData());
    }
}
