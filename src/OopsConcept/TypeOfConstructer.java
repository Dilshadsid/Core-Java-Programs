package OopsConcept;

  class EmployeeConst{
int id;
String name;

/*
 * public EmployeeConst() { // NoArgument Constructor this.id=id;
 * this.name=name; }
 */
   public EmployeeConst(int id,String name) { //peramitrzed constructor 
	   this.id=id;
	   this.name=name;
	}
   
   private EmployeeConst() {
	    System.out.println("private Constructor");
   }
   
   void show() {
	   System.out.println("employee ID :- " + id +" Employee Name :- "+ name);
   }
  }
public class TypeOfConstructer {
  public static void main(String[] args) {
	EmployeeConst employeeConst=new EmployeeConst(999,"Dilshad");
	employeeConst.show();
}

}
