package com.http418.spring.di.withoutSpring;

public class SpringDIApplicationWithoutSpring {

	// call for the constructor injection
	public static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		System.out.println(result);
	}

	// call for the setter injection
//	public static void main(String[] args){
//		BinarySearchImpl binarySearch = new BinarySearchImpl();
//		binarySearch.setSortAlgorithm(new QuickSortAlgorithm());
//		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
//		System.out.println(result);
//	}
}
