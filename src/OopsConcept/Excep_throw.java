package OopsConcept;
import java.io.*; 
public class Excep_throw {
	void m() throws IOException{  
		 throw new IOException("device error");//checked exception	}
	}
	  
	  void p(){  
    try{  
	    m(); 
	    
	   }
	catch(Exception e)
	   {
		   System.out.println("exception handeled");
	   }  
	  }  
	  public static void main(String args[]){  
	   Excep_throw obj=new Excep_throw();  
	   obj.p();  
	   System.out.println("normal flow");  
	  }  
}
