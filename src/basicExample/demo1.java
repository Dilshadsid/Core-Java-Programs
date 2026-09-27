package basicExample;

class simple {
	int xyz() {
		System.out.println("xyz...");
		return 12;

	}
}

public class demo1 extends simple {
	public void show() {
		System.out.println(xyz());
	}

	public static void main(String[] args) {
		demo1 demo = new demo1();
	//	demo.xyz();
		demo.show();

	}
}
