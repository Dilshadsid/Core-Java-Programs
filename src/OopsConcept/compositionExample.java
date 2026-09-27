package OopsConcept;

class Hearth {
	void pump() {
		System.out.println("hearth is pumping ");
	}

}

class Human {
	Hearth hearth;

	public Human() {
		 hearth = new Hearth();
	}

	void live() {
		hearth.pump();
		System.out.println("human is Alive");
	}
}

public class compositionExample {

	public static void main(String[] args) {
     Human hum=new Human();
     hum.live();
	}
}
