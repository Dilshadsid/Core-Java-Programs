package CenterTask;

class InvalideStringException extends RuntimeException {
	public InvalideStringException(String msg) {
		super(msg);
	}
}

public class TaskMain {
	static void validate(String str) {
		if (str == null || str.trim().isEmpty()) {
			throw new InvalidStringException("String in null or Empty");
		}
		System.out.println("valid :- " + str);
	}

	public static void main(String[] args) {
	validate("Sam");
}
}
