package com.basic;

public class SinleLevelIharitance {
	void dell() {
		System.out.println("mouse");
	}
}

class B extends SinleLevelIharitance {
	void hp() {
		System.out.println("keybord");
	}
}

class Test1 {
	public static void main(String[] args) {
		B t = new B();
		t.dell();
		t.hp();
	}
}
