

class Ademo{
	int i=10;
	void show() {
		System.out.println("Ademo:"+i);
	}
}
class Bdemo extends Ademo{
	int i=20;
	void show() {
		super.show();
		System.out.println("Bdemo:"+i);
	}
}
public class Demo {

	public static void main(String[] args) {
		Bdemo bd=new Bdemo();
		bd.show();
		
		// TODO Auto-generated method stub
		int i = 10;
		System.out.println(i++);// 11
		System.out.println(i--);// 10
		System.out.println(i--);// 9
		System.out.println(-+i);// 9
	}

}
