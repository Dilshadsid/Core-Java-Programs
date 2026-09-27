interface C {
	void sum1();
}

public class Demo_interface implements C {
	public void sum1() {
		System.out.println("hii");
	}

	Demo_interface di = new Demo_interface();

}

class B1 implements C {
	public void sum1() {
		System.out.println("hellow");
	}

	public static void main(String[] args) {
		B1 b = new B1();
		b.sum1();
		Demo_interface di = new Demo_interface();
		di.sum1();
	}
}
