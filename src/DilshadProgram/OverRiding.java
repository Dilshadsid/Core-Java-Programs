package DilshadProgram;

class Animal {
	void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("Dog barks");
	}
}

class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("Cat meows");
	}
}

public class OverRiding {
	public static void main(String[] args) {
		Animal[] animals = { new Dog(), new Cat() };

		for (Animal a : animals) {
			a.sound();
		}

	}
}
