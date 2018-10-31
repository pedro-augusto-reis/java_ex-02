package com.http418.spring.test.junit.basic;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class MyMathTest {

    MyMath math = new MyMath();

    @Before // JUnit 5 - @BeforeEach
    public void before(){
        System.out.println("Before");
    }

    @After // JUnit 5 - @AfterEach
    public void after(){
        System.out.println("After");
    }

    @BeforeClass // JUnit 5 - @BeforeAll
    // like the estabilishing a database connection
    public static void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass // JUnit 5 - @AfterAll
    public static void afterClass(){
        System.out.println("After Class");
    }

    @Test // mean this method contains an unit test
    public void sum3number() {
        System.out.println("Test 01");
        // check that the result is VALUE
        assertEquals(6, math.sum(new int[]{1,2,3}));
    }

    @Test
    public void sum1number() {
        System.out.println("Test 02");
        assertEquals(3, math.sum(new int[]{3}));
    }
}