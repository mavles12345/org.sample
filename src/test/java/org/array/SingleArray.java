package org.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class SingleArray {

	public static void main(String[] args) {

		String[] s = { "Selvam", "viji", "Thi", "Henik" };

		System.out.println("Before Sorting");

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

		Arrays.sort(s);

		System.out.println("Before Sorting");

		for (int i = 0; i < s.length; i++) {

			System.out.println(s[i]);

		}

		Comparator com = new ComparatorDemo();

		Arrays.sort(s, com);
		
		System.out.println("After compare method");
		
		for(String x: s) {
			
			System.out.println(x);
		}

	}

}
