package org.array;

import java.util.Scanner;

public class TwoLargestNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter numbers of elements in array");

		int n = s.nextInt();

		int[] arr = new int[n];
		
		System.out.println("Enter all elements");
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i]=s.nextInt();
			
		}
		
		int largest1, largest2, temp;

		largest1 = arr[0];

		largest2 = arr[1];
		
		if (largest1<largest2) {
			
			temp=largest1;
			largest1=largest2;
			largest2=temp;
			
		}
		
		for (int i = 2; i < arr.length; i++) {
			
			if (arr[i]>largest1) {
				
				largest2=largest1;
				largest1=arr[i];
				
			}else if(arr[i]>largest2 && arr[i]!=largest1) {
				
				largest2=arr[i];
				
			}
			
		}
		
		System.out.println("First largest number:" + largest1);
		System.out.println("Second largest number:" + largest2);

	}

}
