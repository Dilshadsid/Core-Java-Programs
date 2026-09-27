
public class DefoultConstructor {
	int id;
	String name;
	double salary;
    Object obj;
	void display() {
		System.out.println(id + "  " + name + "  " + salary+" "+obj);
	}

	public static void main(String[] args) {
		DefoultConstructor d = new DefoultConstructor();
		DefoultConstructor d1 = new DefoultConstructor();
		d.display();
		d1.display();
		
	}

}
