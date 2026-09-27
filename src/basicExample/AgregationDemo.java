package basicExample;
class Yasir{
	
	void disply(){
		System.out.println("this is yasir");
	}
}
class Center{
	String city;
	String name;
	Yasir yasir;
	
	void show() {
		
		System.out.println("this i s Center "+ city);
		System.out.println("this i s "+ name);
		yasir.disply();
	}
}
public class AgregationDemo {
public static void main(String[] args) {
	
	//Yasir y=new Yasir();
	Center c=new Center();
	c.show();
	
	
}
}
