package DemoJava8;

import java.util.function.Function;

public class FunctionDemo {
public static void main(String[] args) {
	Function<String,Integer> fun=(num)-> num.length();
	System.out.println(fun.apply("Abuzar"));
}
}
