package com.basic;

public class overloding_demo {
	void show(int b, int a) {
		System.out.println("by");
	}
	void show(int z) {
		System.out.println("hii");
	}

	public static void main(String[] args) {
		overloding_demo overloding_demo=new overloding_demo();
		overloding_demo.show(1,2);
		overloding_demo.show(4);
	}
}
