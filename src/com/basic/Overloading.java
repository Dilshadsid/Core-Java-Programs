package com.basic;

public class Overloading {

	void M() {
		System.out.println("zxc");
	}
	void M(int a) {
		System.out.println("zxcv");
	
	}
	public static void main(String[] args) {
		
		Overloading d=new Overloading();
		d.M();
		d.M(2);
	}
}
