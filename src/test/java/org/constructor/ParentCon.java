package org.constructor;

public class ParentCon extends Parentchild {

	public ParentCon() {
		super();
		System.out.println("default child");
	}

	ParentCon(int age) {
		super(100);
		System.out.println("parametrised child");
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		
		
		ParentCon obj =new ParentCon();
		ParentCon obj1 =new ParentCon(50);
		
	}
	
}
