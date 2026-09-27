package DemoJava8;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
public static void main(String[] args) {
	BiPredicate<String,String> bpre=(str,str1)-> str.equals(str1);
	System.out.println(bpre.test("abdul", "abdul"));
}
}
