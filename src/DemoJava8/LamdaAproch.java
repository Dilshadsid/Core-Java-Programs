package DemoJava8;
interface Disply{
	void show1();
}
public class LamdaAproch {
public static void main(String[] args) {
	Disply dis=()-> System.out.println("hii");
	dis.show1();
}
}
