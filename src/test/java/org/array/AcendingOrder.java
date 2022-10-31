package org.array;

import java.util.Scanner;

public class AcendingOrder {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("enter number of elements");

		int count = s.nextInt();

		int[] a = new int[count];

		System.out.println("Enter numbers");

		for (int i = 0; i < a.length; i++) {

			a[i] = s.nextInt();

		}

		for (int i = 0; i < count; i++) {

			for (int j = 0; j < count; j++) {

				int temp;

				if (a[i] > a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}

		}

		for (int i = count - 1; i > 0; i--) {

			System.out.print(a[i] + ",");

		}

		System.out.print(a[0]);

	}

}
