package OopsConcept;


abstract class Abz {
	abstract void yasir();
}

class Demo_abstraction extends Abz {
	void yasir() {
		System.out.println("achive abstraction");
	}

	public static void main(String[] args) {
		Demo_abstraction da = new Demo_abstraction();
		da.yasir();
	}
}
