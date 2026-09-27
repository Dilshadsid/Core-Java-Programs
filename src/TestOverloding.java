
class adil {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c)

	{
		return a + b + c;
	}
}

class TestOverloding {
	public static void main(String[] args) {
		System.out.println(adil.add(11, 11));
		System.out.println(adil.add(11, 11, 11));
	}

}
