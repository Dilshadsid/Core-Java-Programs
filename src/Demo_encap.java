
public class Demo_encap {
	private int age;
	private String name;

	public Demo_encap() {

	}

	Demo_encap(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void setAge(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;

	}

	public static void main(String[] args) {
		Demo_encap encap = new Demo_encap();
		encap.setAge(10, "dilshad");
		int age = encap.getAge();

		System.out.println(age);
		// System.out.println("name");

	}
}
