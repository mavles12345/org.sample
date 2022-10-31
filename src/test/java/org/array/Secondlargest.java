package org.array;

public class Secondlargest {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 60 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				int temp;

				if (arr[i] < arr[j]) {

					temp = arr[j];
					arr[j] = arr[i];

					arr[i] = temp;

				}

			}

		}
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
			
		}
		
		System.out.println("Second largest number:"+ arr[arr.length-4]);

	}

}
