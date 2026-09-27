
public class Static_method_access {
	static void m1() {
		System.out.println("hii");
	}

	{
		System.out.println("sakinaka");
	}
	static {
		System.out.println("oppo");
		{
			System.out.println("vivo");
		}
	}

	void show() {
		System.out.println("iphone");
	}

	public static void main(String[] args) {
		Static_method_access treeMap_1 = new Static_method_access();
		treeMap_1.show();
		Static_method_access.m1();

	}
}
