package org.program;

public class OverLoad {

	private void emp(int age) {

		System.out.println(age);
	}

	private void emp(String name, int age) {
		System.out.println(name);

	}
	
	private void emp(long phNo, String name, int age) {
		System.out.println(phNo);
		System.out.println(age);

	}
	
	public static void main(String[] args) {
		
		OverLoad obj=new OverLoad();
		obj.emp("Selvam", 32);
		obj.emp(33);
		obj.emp(9841337757l, "Thishiyan", 5);
		
		
		
	}
}
