abstract class Z {
	abstract int run();
}

class B extends Z {
	int run() {
		System.out.println("hii");
		return 0;
	}
}

class Ab extends Z {
	int run() {
		System.out.println("how are you");
		return 0;
	}
}

class Abstraction_2 extends B {
	public static void main(String[] args) {
		Abstraction_2 abs = new Abstraction_2();
		abs.run();
			}
}
