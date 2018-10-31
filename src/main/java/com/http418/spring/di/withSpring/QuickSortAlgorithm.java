package com.http418.spring.di.withSpring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers){
        // logic for quick sort algorithm
        return numbers;
    }
}
