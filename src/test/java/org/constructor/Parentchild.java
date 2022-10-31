package org.constructor;

public class Parentchild {
	
	public Parentchild() {
		System.out.println("default super");
	}

	Parentchild(int id){
		
		System.out.println("parametrised super");
		System.out.println(id);
		
	}
}
