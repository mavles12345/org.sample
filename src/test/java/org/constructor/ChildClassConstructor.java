package org.constructor;

public class ChildClassConstructor {

	public ChildClassConstructor() {
		this(100);
		System.out.println("default Constructor");
	}

	public ChildClassConstructor(int age) {
		this("selvam", 30);
		System.out.println("parametrized constructor");
		System.out.println(age);

	}

	public ChildClassConstructor(String name, int age) {
		this(9841337757l, 5000.00f);
		System.out.println("name and age");
		System.out.println(name);
		System.out.println(age);
	}

	public ChildClassConstructor(long phNo, float salary) {

		System.out.println("Phone and salary");
		System.out.println(phNo);
		System.out.println(salary);
		
		
	}	

	public static void main(String[] args) {

		ChildClassConstructor obj = new ChildClassConstructor();

	}

}
