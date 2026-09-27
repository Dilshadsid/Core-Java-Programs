package Adiltaxs;
class studentEmp{
	String name;
	int age;
	public studentEmp setName(String name) {
		this.name=name;
		return this;
		// TODO Auto-generated constructor stub
	}
	public studentEmp setAge(int age ) {
		this.age=age;
		return this;
		// TODO Auto-generated constructor stub
	} 
	public void show() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class methodchaning {
   public static void main(String[] args) {
	studentEmp se=new studentEmp();
	/*
	 * se.setAge(23); se.setName("sameer"); se.show();   //normal colling 
	 */
	se.setAge(22).setName("Ahmad").show();//method chaning 
	
}
}
