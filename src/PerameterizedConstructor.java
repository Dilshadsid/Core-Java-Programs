
public class PerameterizedConstructor {
	int id;
	String name;

	PerameterizedConstructor(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void disply() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		PerameterizedConstructor pc = new PerameterizedConstructor(22, "dilshad");
		PerameterizedConstructor pc1 = new PerameterizedConstructor(23, "uzair");
		PerameterizedConstructor pc2 = new PerameterizedConstructor(24, "yasir");
		PerameterizedConstructor pc3 = new PerameterizedConstructor(1995, "jems ghoshly");
		pc.disply();
		pc1.disply();
		pc2.disply();
		pc3.disply();

	}

}
