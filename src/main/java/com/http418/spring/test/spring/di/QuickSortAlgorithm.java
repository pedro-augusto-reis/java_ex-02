package com.http418.spring.test.spring.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers){
        return numbers;
    }
}
