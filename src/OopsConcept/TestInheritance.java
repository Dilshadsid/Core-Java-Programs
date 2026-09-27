package OopsConcept;
//single level Inheritance

public class TestInheritance {
	public static void main(String args[]) {
		Rabit d = new Rabit();
		d.walk();
		d.feeding();
	}

	void feeding() {
		System.out.println("eating...");
	}
}

class Animal {
	void feeding() {
		System.out.println("eating...");
	}
}

class Rabit extends TestInheritance {
	void walk() {
		System.out.println("Walking...");
	}
}
