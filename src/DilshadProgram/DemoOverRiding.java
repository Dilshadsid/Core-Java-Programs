package DilshadProgram;

public class DemoOverRiding {
	
	void Show(int a) {
		System.out.println("show 1 ");
	}
	void Show(Long d) {
		System.out.println("show 2 ");
	}
public static void main(String[] args) {
	DemoOverRiding demoOverRiding =new DemoOverRiding();
	demoOverRiding.Show(747480127);
}
}
