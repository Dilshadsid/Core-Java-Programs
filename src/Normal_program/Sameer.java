package Normal_program;

public class Sameer {

	public static void main(String[] args) {
		System.out.println("sameer siddiqui");
		int[] a = { 1, 2, 2, 3, 4, 5, 6 };
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);

				}

			}

		}

	}
}
