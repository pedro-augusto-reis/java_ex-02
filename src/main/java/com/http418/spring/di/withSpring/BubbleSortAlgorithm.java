package com.http418.spring.di.withSpring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
//@Primary
public class BubbleSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers){
        // logic for bubble sort algorithm
        return numbers;
    }
}
