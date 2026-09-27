package Adiltaxs;

public class staticBlockexample {
	int ab, b;

	public staticBlockexample(int b) {
		this.b = b;
		System.out.println("constroctor " + b);
	}

	{
		ab = 40;

		System.out.println("instance block " + ab);
	}
	static int a, c;
	static {
		a = 10;
		c = 60;
		System.out.println("Satic block");
	}

	static int show() {
		System.out.println("static method");
		return c;

	}

	public static void main(String[] args) {
	System.out.println("syso");
	staticBlockexample block = new staticBlockexample(12);
		show();	
		// System.out.println(a);
	}
}
