package com.ExceptionH;

public class ThrowExceptionExample1 {

	public static void main(String[] args) throws Exception {
		try {
			String string = null;
			int a = string.length();
			System.out.println(a);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
