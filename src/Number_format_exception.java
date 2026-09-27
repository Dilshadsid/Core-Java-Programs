
public class Number_format_exception {

	public static void main(String[] args) {
		String str = "ankit";
		try {
			int a = Integer.parseInt(str);
			System.out.println(a);
		} catch (Exception e) {

			System.out.println(e);
		}

		System.out.println("String number format exception");
	}

}
