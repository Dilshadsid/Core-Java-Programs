package CenterTask;

public class SingeltonMain {
public static void main(String[] args) {
	 SingletonExampal single = SingletonExampal.getSingle();
	 System.out.println(single.hashCode());
	 SingletonExampal single2 = SingletonExampal.getSingle();
	 System.out.println(single2.hashCode());
}
}
