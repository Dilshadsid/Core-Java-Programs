package Adiltaxs;

public class taskArray1 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 }; // output{1,3,6,10,15}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			System.out.println(sum);
			/*
			 * if (i < a.length - 1) { System.out.print(""); }
			 */
		}

	}
}
