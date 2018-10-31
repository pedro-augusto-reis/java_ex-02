package com.http418.spring.test.spring.cdi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

//@RunWith(SpringRunner.class)
//@ContextConfiguration(classes = SpringCdiApplication.class)
@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

    @Mock
    SomeCdiDao daoMock;

    @Autowired
    @InjectMocks
    SomeCdiBusiness business;

    @Test
    public void findGreatest01() {
        Mockito.when(daoMock.getData()).thenReturn(new int[]{2,4});
        assertEquals(4, business.findGreatest());
    }

    @Test
    public void findGreatest02() {
        Mockito.when(daoMock.getData()).thenReturn(new int[]{2,4,546,897,1,534,148,21438,3513});
        assertEquals(21438, business.findGreatest());
    }

    @Test
    public void findGreatestNoElements() {
        Mockito.when(daoMock.getData()).thenReturn(new int[]{ });
        assertEquals(Integer.MIN_VALUE, business.findGreatest());
    }

    @Test
    public void findGreatestEqualElements() {
        Mockito.when(daoMock.getData()).thenReturn(new int[]{2,2});
        assertEquals(2, business.findGreatest());
    }
}