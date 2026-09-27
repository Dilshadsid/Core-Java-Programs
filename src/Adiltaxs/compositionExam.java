package Adiltaxs;

class House {
	void houseDetails() {
		System.out.println(" 3 BHK flat  ");
	}
}

class place {
	private House house;

	public place() {
		this.house = new House();
		System.out.println("near mumbai ");
	}

	void price() {
		house.houseDetails();
      System.out.println("2CR");
	}
}

public class compositionExam {
	public static void main(String[] args) {
		place p=new place();
        p.price();
	}

}
