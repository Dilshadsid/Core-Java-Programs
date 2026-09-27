package Adiltaxs;
class student{
     private	int num;
	 private String name;
	
	public void setNum(int num) {
		this.num=num;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getNum() {
		
		return num;
	}
	public String getName() {
		
		return name;
		
	}
}

public class encapsulationexample {
	public static void main(String[] args) {
		 student std=new student();
		 std.setName("xyz");
		 std.setNum(10);
        System.out.println( std.getName());
        System.out.println(std.getNum()); 
	}
  
}
