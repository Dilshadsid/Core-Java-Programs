package Adiltaxs;
class Example{
	void play() {
		System.out.println("play Out Dor game ");
	}
}
public class SuperExample extends Example{
    void run() {
    	super.play();
    	System.out.println("im runing..");
    }
public static void main(String[] args) {
	SuperExample ex=new SuperExample();
	ex.run();
	
}
}
