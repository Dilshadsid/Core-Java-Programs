// string mumbai hai jo even charector pe hai vo uper case me aajaye 

public class DemoString {
	public static void main(String[] args) {
		String s1 = "mumbai";
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if ((i + 1) % 2 == 0) {
				sb.append(Character.toUpperCase(ch)); // Convert to uppercase
			} else {
				sb.append(ch);
			}
		}
		String result = sb.toString();
		System.out.println(s1);
		System.out.println(result);
	}
}
