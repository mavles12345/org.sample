package org.array;

import java.util.Arrays;

public class Arrayscompare {

	public static void main(String[] args) {

		int[] arr1 = { 10, 20, 30 };
		int[] arr2 = { 10, 30, 20 };
		
//		boolean equals = arr1.equals(arr2);
//		System.out.println(equals);
//		
//		boolean equals2 = Arrays.equals(arr1, arr2);
//		System.out.println(equals2);
//		
//		Arrays.sort(arr2);
//		
//		for (int i = 0; i < arr2.length; i++) {
//			
//			System.out.println(arr2[i]);
//			
//		}
		
		String [] src= {"", ""};
		
		ComparatorArraysDemo cc=new ComparatorArraysDemo();
		
		Arrays.sort(src, cc);
		
		for (int i = 0; i < src.length; i++) {
			
			System.out.println(src[i]);
			
		}

	}

}
