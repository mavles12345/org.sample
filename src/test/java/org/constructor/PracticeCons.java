package org.constructor;

public class PracticeCons extends PracticeParent {

	public PracticeCons() {

		super();

		System.out.println("default Constructor");

	}

	public PracticeCons(int age) {

		super(100);

		System.out.println("default Constructor");
		System.out.println(age);

	}

	public static void main(String[] args) {

		PracticeCons con = new PracticeCons();
		PracticeCons con1 = new PracticeCons(50);
	}
}
