package DilshadProgram;

class Company {
	static double increment = 10000.00;
	static double decrement = 20000.00;

	void payment(int empId, double salary){
		System.out.println("Company Payment: " + empId + " Salary: " + (salary + increment));
	}
}

public class EmployeeOverriding extends Company {
	@Override
	void payment(int empId, double salary) {

		super.payment(empId, salary - decrement);

		System.out.println("Employee Payment After Decrement:"
				+ " " + empId + " Salary: " + (salary + increment));
	}

	public static void main(String[] args) {
		Company emp = new EmployeeOverriding(); // Upcasting
		emp.payment(20, 500000);
	}
}
