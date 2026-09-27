package DemoJava8;

import java.util.function.Predicate;

public class PredicateDemo {
public static void main(String[] args) {
	Predicate<String> pre=(str)-> str.toUpperCase().isEmpty();
	System.out.println(pre.test("Dilshad"));
}
}
