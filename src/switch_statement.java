
public class switch_statement {

	public static void main(String[] args) {
		int num = 5;
		String size;
		switch (num) {
		case 1:
			size = "small";
			break;
		case 2:
			size = "mediom";
			break;
		case 5:
			size = "average";
			break;
		case 6:
			size = "large";
			break;
		default:
			size = "nathing";
			break;
		}
		System.out.println("size:" + size);
	}

}
