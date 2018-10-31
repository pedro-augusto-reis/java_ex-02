package com.http418.spring.test.spring.di;

import com.http418.spring.test.spring.di.BinarySearchImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

// Load the context / bean
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/applicationContextTest.xml")
public class BinarySearchXmlImplTest {

    // Get this bean from the context
    @Autowired
    BinarySearchImpl bImpl;

    @Test
    public void binarySearch() {
        assertEquals(3,bImpl.binarySearch(new int[]{}, 5));
    }
}