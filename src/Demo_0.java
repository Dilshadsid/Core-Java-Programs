
public class Demo_0 {
	public int sum(int a, int b) {
		return a + b;
	}

	public int sum(int a, int b, int c) {
		return a + b + c;
	}

	public int sum(int... a) {
		return 28;
		// System.out.println(sum+=a);
	}

	public static void main(String[] args) {
		Demo_0 demo_0 = new Demo_0();
		System.out.println(demo_0.sum(5, 5, 5, 5));
	}
}
