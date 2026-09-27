package Adiltaxs;
class employee{
	int id;
	String name;
	
	public employee() {
     this(0,"nathing");
     System.out.println("defounl constructor");
	}
	
	public employee(int id1,String name1) {
		this.id=id1;
		this.name=name1;
		System.out.println("peramitriz constructor");
	}
}
public class constructorChaining {
	public static void main(String[] args) {
		employee em=new employee();
		
	}
	}
