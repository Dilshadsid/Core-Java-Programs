package basicExample;

class A {
	A get() {
		System.out.println("hello");
		return this;
	}
}
class B extends A{
	B get() {
		System.out.println("hey");
		return this;
		
	} 
}
public class CovariantExample extends B {
	CovariantExample get() {
		return this;
	}
	
	public static void main(String args[]) {
		new CovariantExample().get();
	}
}
