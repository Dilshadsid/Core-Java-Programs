package DemoJava8;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
public static void main(String[] args) {
	BiConsumer<String,String> bcon=(str,str1)-> System.out.println(str==str1);
	bcon.accept("dilshad","Dilshad");
}
}
