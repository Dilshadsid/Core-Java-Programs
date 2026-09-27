
public class Demo_paramet_constuct {
	int id;
	String name;

	Demo_paramet_constuct(int i, String n) {
		id = i;
		name = n;
	}

	void xyz() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		Demo_paramet_constuct pc = new Demo_paramet_constuct(101, "dilshad");
		Demo_paramet_constuct pc2 = new Demo_paramet_constuct(123, null);
		pc.xyz();
		pc2.xyz();

//	/TODO Auto-generated method stub
//
//
//	 TODO Auto-generated method stub
//
	}
}
