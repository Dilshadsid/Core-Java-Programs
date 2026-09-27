package com.basic;

public class BlockExample {
	int a;
	static int b;

	public BlockExample() {
		System.out.println("Consturector");
	}

	{
		a = 10;
		System.out.println("hey " + a);
	}
	static {
		b = 20;
		System.out.println("Static " + b);
	}

	public static void main(String[] args) {
		System.out.println("bay");
		BlockExample example = new BlockExample();
		BlockExample example1 = new BlockExample();

	}
}
