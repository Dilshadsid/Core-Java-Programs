package com.basic;

 class Amount {
	private long acc_no;
	private String name,email;
	private float amount;
	
	public long getAcc_no()  {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount=amount;
		
	}
}
class Test_Encapsulation_Amount{
	public static void main(String[] args) {
		Amount acc = new Amount();
		acc.setAcc_no(1234567890L);
		acc.setName("dilshad");
		acc.setEmail("dilshadsiddiqui389@gmail.com");
		acc.setAmount(1999f);
		 System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  

	}
}
