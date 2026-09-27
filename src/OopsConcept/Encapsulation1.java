package OopsConcept;

import java.security.interfaces.RSAMultiPrimePrivateCrtKey;

class DemoEncap {
	private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class Encapsulation1 {
	public static void main(String[] args) {
		DemoEncap demoEncap = new DemoEncap();
		demoEncap.setId(1);
		demoEncap.setName("Ahmed G");
		demoEncap.setAge(71);
		System.out.println(demoEncap.getId() + " - " + demoEncap.getName() + " - " + demoEncap.getAge());
	}
}
