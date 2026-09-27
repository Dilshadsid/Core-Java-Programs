package BiPredicate.copy;

import java.util.function.BiPredicate;

public class StringStartwith {
public static void main(String[] args) {
	 BiPredicate<String, String> startsWith = (str1, str2) -> str1.startsWith(str2);
     System.out.println(startsWith.test("hello", "he"));    // true
     System.out.println(startsWith.test("world", "wo"));    // true
     System.out.println(startsWith.test("java", "python")); // false
}
}
