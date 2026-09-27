package com.ExceptionH;

class UmairException extends Exception {
	public UmairException(String massage) {
		super(massage);// TODO Auto-generated constructor stub
	}
}

public class DemoException {

	public static void demo() throws UmairException {

		String string = null;
		String str = "_umair";
		if (string == null) {
			throw new UmairException("String is null, cannot concat!");
		}
		System.out.println(string.concat(str));
	}

	public static void main(String[] args) {
		try {
			DemoException demoException = new DemoException();
			demoException.demo();
		} catch (UmairException e) {
			System.out.println("umair gandu " + e.getMessage());
		}

	}

}
