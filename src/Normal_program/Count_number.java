package Normal_program;

public class Count_number {
	public static void main(String[] args) {
		int a = 123473;
		int n = a;
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		System.out.println("number of digit " + a + " is : " + count);
	}

}
