package DemoJava8;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
     BiFunction<Integer,Integer,Integer> num=(a,b)-> a*b ;
     Integer count= num.apply(60, 2);
     System.out.println(count);
	}

}
