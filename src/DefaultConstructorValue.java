
public class DefaultConstructorValue {
	int id;
	String name;

	void disply() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		DefaultConstructorValue dcv = new DefaultConstructorValue();
		dcv.disply();
		dcv.disply();
	}

}
