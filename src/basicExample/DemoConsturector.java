package basicExample;

import com.basic.ConstructorChaning;

public class DemoConsturector {
	
	public DemoConsturector(int a)
	{
		System.out.println("hello");
	}

	public DemoConsturector(int a, int b) {
		this(1);
	}

	public DemoConsturector() {
		this(1, 2);
	}

	public static void main(String[] args) {
		ConstructorChaning con = new ConstructorChaning();
	}
}
