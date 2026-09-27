package com.basic;

public class ConstructorChaning {
	public ConstructorChaning(int a) {
		System.out.println("hello");
	}

	public ConstructorChaning(int a, int b) {
		this(1);
	}

	public ConstructorChaning() {
		this(1, 2);
	}

	public static void main(String[] args) {
    ConstructorChaning con= new ConstructorChaning();
	}
}
