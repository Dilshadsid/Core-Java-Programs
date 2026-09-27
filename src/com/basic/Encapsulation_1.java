package com.basic;



class Abc {
		private int id;
		private String name;
		private double salary;
		private String email;

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
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
}
class Encapsulation_1
{
	public static void main(String[] args) {
     Abc test=new Abc();
     test.setId(101);
     test.setName("Abdul");
     test.setSalary(50000);
     test.setEmail("Abdul999@gmail.com");
     System.out.println(test.getId()+"\n "+test.getName()+" \n"+ test.getSalary()+" \n"+test.getEmail());
     
	}
}

