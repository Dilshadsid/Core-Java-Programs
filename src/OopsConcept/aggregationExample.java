package OopsConcept;

class Employee {
	int id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Tata {
	String addrace;
	String email;
	Employee emp;

	public Tata(String addrace, String email,Employee emp) {
		this.addrace = addrace;
		this.email = email;
		this.emp=emp;
	}

	void show() {

		System.out.println("empolyee id : " + emp.id);
		System.out.println("employee name : " + emp.name);
		System.out.println("employee addrace : " + addrace);
		System.out.println("employee email : "+ email);

	}
}

public class aggregationExample {
	public static void main(String[] args) {
		Employee employee=new Employee(11, "Dilshad Siddiqui");
		Tata tata=new Tata("Sake naka mumbai", "dilshadTech999@gmail.com",employee);
		tata.show();
	}
}
