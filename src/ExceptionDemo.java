import java.io.IOException;

class Custom extends RuntimeException {
	Custom(String message) {
		super(message);
	}
}

public class ExceptionDemo {

	public static void main(String[] args) throws Exception {
		try {
			int a = 10;
			int b = 2;
			if (a < b) {
				throw new Custom("b is greater...");

			}
		} catch (Exception e) {
			System.out.println("e.printStackTrace()");
		}

	}

}
