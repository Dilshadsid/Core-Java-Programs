package BiPredicate.copy;

import java.util.function.BiPredicate;

public class CheckingIfTwoObjectsAreOfTheSameype {
public static void main(String[] args) {
	BiPredicate<Object, Object> sameType = (obj1, obj2) -> obj1.getClass().equals(obj2.getClass());
    System.out.println(sameType.test("hello", "world"));    // true
    System.out.println(sameType.test("hello", 10));         // false
}
}
