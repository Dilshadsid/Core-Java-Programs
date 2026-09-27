package com.basic;

 class Encapsulation0{
	 int id;
	   String name;
	  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
 }
public class Encapsulation1 {
 
  public static void main(String[] args) {
	  Encapsulation0 el=new Encapsulation0();
	  
	  el.setId(12);
	  el.setName("dilshad");
	  System.out.println(el.getId()+" "+el.getName());
}
}
