package DilshadProgram;

interface Payment {
	void phonePay();
	
}

abstract class Gpay {
	abstract void googlePay();
	void cashPay() {
		System.out.println("cashPaying Hand to Hand ....");
	}
}

public class MultipalInharitance extends Gpay implements Payment{

	@Override
	public void phonePay() {
		System.out.println("Pay using Nuber..");
		
	}

	@Override
	void googlePay() {
		System.out.println("Pay Using QR..Code ");
		
	}
	
	public static void main(String[] args) {
		MultipalInharitance multi = new MultipalInharitance();
		multi.googlePay();
		multi.cashPay();
	}

}
