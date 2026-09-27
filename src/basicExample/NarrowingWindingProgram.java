package basicExample;

public class NarrowingWindingProgram {
public static void main(String[] args) {
	float age = 130.99f;
	int Raheem=(int)age;
	System.out.println( Raheem);
	double ramu=age;
	System.out.println(ramu);
	
	
	byte a=(byte) age;
	long b= a;
	System.out.println(a+" "+ b);
	System.out.println(b);
	char ch ='A';
	int chx = (char)ch;
    System.out.println(chx);
    byte y=20;
    byte z=30;
    int yz= y+z;
    System.out.println(yz);
}
}
