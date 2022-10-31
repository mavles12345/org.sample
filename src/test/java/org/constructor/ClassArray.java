package org.constructor;

import java.util.ArrayList;

public class ClassArray {
	
	public static void main(String[] args) {
		
		ArrayList<ArrayConstructor> arr=new ArrayList<ArrayConstructor>();
		
		ArrayConstructor obj1=new ArrayConstructor(10);
		ArrayConstructor obj2=new ArrayConstructor(20);
		ArrayConstructor obj3=new ArrayConstructor(30);
		ArrayConstructor obj4=new ArrayConstructor(40);
		ArrayConstructor obj5=new ArrayConstructor(50);
		
		arr.add(obj1);
		arr.add(obj2);
		arr.add(obj3);
		arr.add(obj4);
		arr.add(obj5);
		
		for (int i = 0; i < arr.size(); i++) {
			
			System.out.println(arr.get(i).age);
			
			
			
		}
		
		
		
		
		
		
	}

}
