package DilshadProgram;

public class LargestNumberUsingIfElse {

	static int bigestNumber(int x, int y, int z) {
		if (x >= y && x > z) {
			return x;
		}
		if (y >= x && y >= z) {

			return y;
		} else
			System.out.println(z);

		return z;
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 19;
		LargestNumberUsingIfElse.bigestNumber(a, b, c);

	}
}
