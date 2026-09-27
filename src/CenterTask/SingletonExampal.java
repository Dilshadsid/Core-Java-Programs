package CenterTask;
   
public class SingletonExampal {
  private static SingletonExampal single;
  
     private SingletonExampal() {

     }
      //lazy way to create singleton object 
     public static SingletonExampal getSingle() {
    	 if (single==null) {
			single = new SingletonExampal();
		}
		return single;
	}
}
