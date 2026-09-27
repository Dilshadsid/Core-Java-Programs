package com.ExceptionH;

import java.io.IOException;

class M {
	void method() throws IOException {
		System.out.println("hello");
		throw new IOException("device error");
		
	}
}

public class example2 {
	public static void main(String args[]) throws IOException {// declare exception
		M m = new M();
		m.method();
		System.out.println("normal flow...");
	}
}
