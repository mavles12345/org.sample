package org.array;

import java.util.Arrays;
import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("enter number of Array");

		int s1 = s.nextInt();

		int[] arr = new int[s1];

		System.out.println("Enter arry numbers");

		for (int i = 0; i < arr.length; i++) {

			arr[i] = s.nextInt();

		}

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				int temp = 0;

				if (arr[i] > arr[j]) {

					temp = arr[i];

					arr[i] = arr[j];

					arr[j] = temp;

				}

			}

		}

		for (int i =0; i <= s1-1; i++) {

			System.out.print(arr[i] + ",");

		}
		//System.out.print(arr[0]);
		System.out.println("Second largest: "+ arr[arr.length-2]);
		System.out.println("Third largest: "+ arr[arr.length-3]);
	}

}
