package DilshadProgram;

public class Library {
	String books() {
		return " --- keep silance ";
	}

	String books(int id, String name) {
		return "You requested book: " + name + " (ID: " + id + ")";
	}

	public static void main(String[] args) {
		Library library = new Library();

		System.out.println(library.books(14, "Data Structure"));
		System.out.println(library.books());
	}
}
