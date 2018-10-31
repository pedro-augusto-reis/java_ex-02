package com.http418.spring.di.withSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    // Field injection example
    @Autowired
    //@Qualifier("quick")
    private SortAlgorithm sortAlgorithm;

    // Constructor injection example
//    @Autowired // the annotation is not necessary in the constructor injection.
//    @Qualifier("quick")
//    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }

    // Setter injection example
//    @Autowired
//    @Qualifier("quick")
//    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }

    public int binarySearch(int[] numbers, int numberToSearchFor){
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        return 3;
    }

    // Solve multiple beans for an autowired object
        // 1. add @Primary annotation in the implemented class
        // 2. create the object with the same name as the implemented class
            // 2.1 private SortAlgorithm bubbleSortAlgorithm;
        // 3. use @Qualifier annotation

    // Spring Documentation
        /* "The Spring team generally advocates constructor injection as it enables one to implement application components as
        immutable objects and to ensure that required dependencies are not null. Furthermore, constructor-injected components
        are always returned to client (calling) code in a fully initialized state. As a side note, a large number of constructor
        arguments is a bad code smell, implying that the class likely has too many responsibilities and should be refactored
        to better address proper separation of concerns.

        Setter injection should primarily only be used for optional dependencies that can be assigned reasonable default values
        within the class. Otherwise, not-null checks must be performed everywhere the code uses the dependency. One benefit
        of setter injection is that setter methods make objects of that class amenable to reconfiguration or re-injection later." */
}
