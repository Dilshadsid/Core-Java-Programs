package OopsConcept;
 
abstract class phone{
	abstract void show();
}
interface demoabs{
  void show1();
}
 class test11 extends phone implements demoabs{

	@Override
	public void show1() {
		System.out.println("Ahmed center");
	}
	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("sakinaka");
	}
 }
public class abstractExampal {
public static void main(String[] args) {
	 phone test = new test11();
	 test.show();
	 demoabs test11 = new test11();
	 test11.show1();
}
}
