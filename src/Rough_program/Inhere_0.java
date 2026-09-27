package Rough_program;


public class Inhere_0 {
	public static void main(String[] args) {
		monkey monkey=new monkey();
		monkey.raj();
		monkey.moon();
		}
	void raj()
	{
		System.out.println("raju");
	}

}
class monkey extends Inhere_0{
	void moon(){
		System.out.println("Moonknight");
	}
	
}
