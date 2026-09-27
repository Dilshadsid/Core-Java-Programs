package DilshadProgram;

interface Demo {
	 public void  m1();
}

public class demoAnonimus {
	void m1(){
		System.out.println("hello");
	}

	static demoAnonimus d = new demoAnonimus() {

	};

	public static void main(String[] args) {
		d.m1();
	}

}
