package com.basic;
class gurugi{
	private int student;
	private String subject;
	private String cource;
	private String email;
	
	public int getStudent() {
		return student;
	}
	public void setStudent(int student) {
		this.student = student;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject=subject;
	}
	 public String getCource() {
		 return cource;
	 }
	 public void SetCource(String cource) {
		 this.cource=cource;
	 }
	 public String getEmail() {
		 return email;
	 }
	public void setEmail(String email) {
		this.email=email;
	}
}
public class Encapsulation_Example {
public static void main(String[] args) {
	gurugi exm=new gurugi();
	exm.setStudent(5);
	exm.setSubject("java");
	exm.SetCource("BCA");
	exm.setEmail("dilshadsiddiqui389@gmail.conm");
	 System.out.println("how many student in class :"+exm.getStudent()+" what are you studing : "+exm.getSubject()+" what is the cource : "+exm.getCource()+" what is your email : "+exm.getEmail());
System.out.println("fuck you ........ ");  
}
}
