package basicExample;

class Animal {
	String getType() {
		return "I am an Animal";
	}

	Animal getAnimal() {
		System.out.println("Animal.getAnimal() called");
		return this;
	}
}

//Subclass
class Dog extends Animal {
	@Override
	Dog getAnimal() {
		System.out.println("Dog.getAnimal() called");
		return this;
	}

	String bark() {
		return "Woof!";
	}
}

class CoveriontRetornTypeExam {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.getAnimal();

		Dog d = new Dog();
		d.getAnimal().bark(); // Dog's version of getAnimal returns Dog, not just Animal

		// Even if we use polymorphism
		Animal ad = new Dog();
		ad.getAnimal(); // Will call Dog's method
	}
}
