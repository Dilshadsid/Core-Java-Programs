
abstract class Devil {

	abstract int car();

}

class Don extends Devil {
	int car() {
		System.out.println("Rang Rover");
		return 0;
	}
}

public class Abstraction_1 extends Don {
	int car() {
		System.out.println("Bugatti Veyron");
		return 0;
	}

	public static void main(String[] args) {
		Abstraction_1 ab = new Abstraction_1();
		ab.car();
		Don don = new Don();
		don.car();

	}
}