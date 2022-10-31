package org.program;

public class Abstractextn extends Abstraction {

	@Override
	public void saving() {
		System.out.println("Saving % 10%");

	}

	@Override
	public void deposit() {
		System.out.println("deposit % 10%");

	}
	
	public static void main(String[] args) {
		
		Abstractextn obj =new Abstractextn();
		
		obj.bank();
		obj.saving();
		obj.deposit();
		
	}

}
