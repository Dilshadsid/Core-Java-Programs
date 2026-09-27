package OopsConcept;
      //---- Adapter desain  paitern ----//
interface show{
	void showdata();
}

class Msc{
	public void showdata() {
		System.out.println("watching reels");
	}
	
}
public class Adapter_desionPaitern  extends Msc implements show{
 
	public void display() {
		System.out.println("dislpay ");
	}
	public static void main(String[] args) {
		Adapter_desionPaitern ad=new Adapter_desionPaitern();
		ad.display();
		ad.showdata();
				
	}
}
