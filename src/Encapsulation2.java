
class Employee{
	private int id;
	private String name;
	private long mobileNo;

	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo=mobileNo;
	}
}
 class Encapsulation2 {
  public static void main(String[] args) {
	Employee emp=new Employee();
	emp.setId(201);
	emp.setName("Hassan khan");
	emp.setMobileNo(9898989810l);
	System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getMobileNo());
}
}
