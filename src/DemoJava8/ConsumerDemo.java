package DemoJava8;

import java.util.function.Consumer;

public class ConsumerDemo {
public static void main(String[] args) {
	Consumer<Integer> con=num-> System.out.println(num>18);
	con.accept(20);
}
}
