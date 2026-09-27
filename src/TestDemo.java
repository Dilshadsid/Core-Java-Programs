//wap to addition nd subtraction using interface?
interface AddMu {
	int add(int a, int b);

	int sub(int a, int b);
}

public class TestDemo implements AddMu {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {

		return a - b;
	}

	public static void main(String[] args) {
		TestDemo a = new TestDemo();
		int i = a.add(10, 5);
		int z = a.sub(10, 5);
		System.out.println(i);
		System.out.println(z);
	}

}
