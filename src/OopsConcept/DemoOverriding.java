package OopsConcept;


class demo{
	void sum() {
		System.out.println("hii sir");
	}
}
public class DemoOverriding extends demo{
void sum() {
	System.out.println("by sir");
}
public static void main(String[] args) {
	DemoOverriding dm=new DemoOverriding();
	dm.sum();
}
}
