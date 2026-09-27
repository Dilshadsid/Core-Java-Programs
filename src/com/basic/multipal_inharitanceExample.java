package com.basic;
interface Sumsung{
	abstract void model();
}
interface lonch{
  abstract	void lonching();

abstract void model();
}
public class multipal_inharitanceExample implements lonch,Sumsung{

	void show(){
		System.out.println("god father INTEX ");
	}
	@Override
	public void model() {
		System.out.println("Sumsung s24 ultra");
	}
	@Override
	public void lonching() {
     System.out.println("2024 new lonched Phone is :2025 fab");		
	}
	public static void main(String[] args) {
		multipal_inharitanceExample ex=new multipal_inharitanceExample();
        ex.show();
        ex.model();
        ex.lonching();
        
        
       
			
			
		
	}
	
		

}
