
public class ExceptionA {
	public static void main(String[] args) {
		System.out.println("learn coding");
		try {
			int a = 10, b = 0, c;
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("like share");
		} finally {
			System.out.println("sarfaraz");
		}
	}
}
