package Adiltaxs;

public class demo33 {
int a=10;
static int b=20;
public static void main(String[] args) {
	demo33 d=new demo33();
	d.a=200;
	d.b=300;
	System.out.println(d.a+" "+d.b);
    demo33 de1 =new demo33();
    de1.a=400;
    de1.b=50;
    System.out.println(d.a+" "+d.b);
    System.out.println(de1.a +" "+ de1.b);
    
}
}
