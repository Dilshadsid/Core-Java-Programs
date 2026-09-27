package BiPredicate.copy;

import java.util.ArrayList;
import java.util.function.BiPredicate;

public class CkeckTheMarkasIsGreaterOrNot {
public static void main(String[] args) {
	BiPredicate<Integer,Integer> marks=(student1,student2)-> student1 >10 && student2 < 20;
    System.out.println(marks.test(11,17));
	
}
}
