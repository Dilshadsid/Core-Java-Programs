package com.basic;

abstract class Add {
	abstract int addtion(int a, int b);
}

interface Sub {
	int subtraction(int a, int b);
}

public class InterfaceExample extends Add implements  Sub {
	

	public int subtraction(int a, int b) {

		return a - b;
	}

	public int addtion(int a, int b) {

		return a + b;
	}
	
	public static void main(String[] args) {
		InterfaceExample main=new InterfaceExample();
		
		System.out.println("this is addtion : "+main.addtion(20,10 ));
		System.out.println("this is subtraction: "+main.subtraction(20,10));
	}
}
