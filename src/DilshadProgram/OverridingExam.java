package DilshadProgram;

class TVChanal {
	int id;
	String TVname;
	String tVchanal;

	public TVChanal(int id, String tVname, String tVchanal) {
		super();
		this.id = id;
		TVname = tVname;
		this.tVchanal = tVchanal;
	}

	void show() {
		System.out.println("Chanal no :- " + id + "/n show name :- " + TVname + " /n Chanal Name :- " + tVchanal);
	}

}

class Chanal extends TVChanal {
	String hoSt;

	public Chanal(int id, String tVname, String tVchanal, String hoSt) {
		super(id, tVname, tVchanal);
		this.hoSt = hoSt;
		// TODO Auto-generated constructor stub
	}

	@Override
	void show() {
		// System.out.println(id +" "+ TVname +" "+ tVchanal+" "+hoSt);
		System.out.println("Chanal no :- " + id + " show name :- " + TVname + "  Chanal Name :- " + tVchanal
				+ "  Host name :=" + hoSt);

	}

}

public class OverridingExam {
	public static void main(String[] args) {
		TVChanal ch = new Chanal(401, "Animal Planat", "History TV 18", "Salman bhai");
		ch.show();
	}
}
