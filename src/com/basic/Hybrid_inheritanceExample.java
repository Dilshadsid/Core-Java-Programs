package com.basic;

class A1 {
	void eat() {
		System.out.println("khayega ky......");
		System.out.println("badeka");
	}
}

interface A2 {
	void cloths();
}

class A3 extends A1 implements A2 {
	void house() {
		System.out.println("rahega kahan....");
		System.out.println("Antiya me");
	}

	@Override
	public void cloths() {
		System.out.println("pehne ga ky...");
		System.out.println("LV ke kapde");
		// TODO Auto-generated method stub

	}
}

public class Hybrid_inheritanceExample {
	public static void main(String[] args) {
		A3 a3 = new A3();
		a3.eat();
		a3.cloths();
		a3.house();
	}
}
