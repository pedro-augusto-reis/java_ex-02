package com.http418.spring.test.junit.basic;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTest {

    @Test
    public void teste01(){
        assertEquals(1,2);
    }

    @Test
    public void teste02(){
        boolean cond = true;
        assertTrue(cond);
    }

    @Test
    public void teste03(){
        boolean cond = true;
        assertFalse(cond);
    }

    @Test
    public void teste04(){
        boolean cond = true;
        assertNull(cond); assertNotNull(cond);
    }
}
