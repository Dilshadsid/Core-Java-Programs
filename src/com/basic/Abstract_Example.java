package com.basic;

abstract class Demo {
	abstract void StateBank();
	void sum() {
		int a=10,b=5;
		System.out.println(a*b);
	}
}
class Demo1 extends Demo {
	void WorldBank() {
		System.out.println("IDBI bank");
	}
	@Override
	void StateBank() {
		System.out.println("SBI bank");
	}
}
public class Abstract_Example {
	public static void main(String[] args) {

		Demo1 dm = new Demo1();
		dm.StateBank();
		dm.WorldBank();
		dm.sum();
	}
}