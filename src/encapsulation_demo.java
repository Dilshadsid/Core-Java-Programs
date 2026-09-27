
class book {
	private int roll;
	private String name;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class encapsulation_demo {
	public static void main(String[] args) {
		book book = new book();
		book.setRoll(123);
		book.setName("java program");
		System.out.println(book.getRoll() + " " + book.getName());
	}
}
