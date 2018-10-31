package com.http418.spring.test.junit.basic;

public class MyMath {

    int sum(int[] numbers){
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }
}
