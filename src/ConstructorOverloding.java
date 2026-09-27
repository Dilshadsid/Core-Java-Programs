
public class ConstructorOverloding {
	int id;
	String name;
	int sallry;
    String Add;
	ConstructorOverloding(int id, String name) {
		this.id = id;
		this.name = name;

	}

	ConstructorOverloding(int id, String name, int sallry) {
		this.id = id;
		this.name = name;
		this.sallry = sallry;
	}
	public ConstructorOverloding( int id, String name, int sallry, String Add) {
     this.id=id;
     this.name=name;
     this.sallry=sallry;
     this.Add=Add;
	}

	void disply() {
		System.out.println(id + " " + name + " " + sallry+" "+Add);
	}

	public static void main(String[] args) {
		ConstructorOverloding c1 = new ConstructorOverloding(12, "raaj");
		ConstructorOverloding c2 = new ConstructorOverloding(11, "joni", 200000);
		ConstructorOverloding c3 =new ConstructorOverloding(45,"saad",400000,"Thane eist");
		c1.disply();
		c2.disply();
		c3.disply();

	}

}
