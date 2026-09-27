package com.basic;
// WAP to show adding or multiply using multipal inherantas 

interface Aa {
	void add(int a,int b);
}

interface Bb {
	void mult(int a,int b);
}

public class MultipalProgram implements Aa, Bb {
	


	@Override
	public void add(int a, int b) {
		System.out.println(a+b);
	}

	@Override
	public void mult(int a, int b) {
		System.out.println(a*b);
	}
	public static void main (String []args) {
	MultipalProgram m=new MultipalProgram();
	m.add(10,10);
	m.mult(20, 10);
}
	}
