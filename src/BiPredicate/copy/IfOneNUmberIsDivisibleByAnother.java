package BiPredicate.copy;

import java.util.function.BiPredicate;

public class IfOneNUmberIsDivisibleByAnother {
public static void main(String[] args) {
	 BiPredicate<Integer, Integer> isDivisible = (num1, num2) -> num1 % num2 == 0;
     System.out.println(isDivisible.test(10, 2));   // true
     System.out.println(isDivisible.test(10, 3));   // false
}
}
