package OopsConcept;

class EncapDemo {
	private int id;
	private String name;
	private int age;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		}
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}

public class EncapsulationExampal {
	public static void main(String[] args) {
     EncapDemo enc = new EncapDemo();
     enc.setId(10);
     enc.setName("Abrar");
     enc.setAge(21);
     System.out.println("ID: " + enc.getId());
     System.out.println("Name: " + enc.getName());
     System.out.println("Age: " + enc.getAge());
	}
}
