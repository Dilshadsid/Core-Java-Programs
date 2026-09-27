package basicExample;



public class DemoBlockExample {
	int a;
	static int b;

	public DemoBlockExample() {
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
		DemoBlockExample example = new DemoBlockExample();
		DemoBlockExample example1 = new DemoBlockExample();

	}
}
