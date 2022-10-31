package org.constructor;

public class Constructor1 {
	
	String name;
	int age;
	
	public Constructor1(String name, int age) {
		
		this.name=name;
		this.age=age;
		
		System.out.println(name+" "+age);
		
		
	}
	
	public static void main(String[] args) {
		
		Constructor1 obj=new Constructor1("selvam", 33);
		
	}

}
