package Normal_program;

public class DemoException {
	public static void main(String[] args) {
		
	
	try {
        methodC();
    } catch (ArithmeticException e) {
        System.out.println("Caught in main: " + e.getMessage());
    }
}

public static void methodC() {
    methodB();
}

public static void methodB() {
    methodA();
}

public static void methodA() {
    throw new ArithmeticException("Division by zero");
}

}
