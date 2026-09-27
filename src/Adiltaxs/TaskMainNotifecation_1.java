package Adiltaxs;

abstract class Notification {
	abstract void send(String message);
}

class EmailNotification extends Notification {
	@Override
	void send(String message) {
		System.out.println("Sending email: " + message);
	}
}

class AppNotification extends Notification {
	@Override
	void send(String message) {
		System.out.println("Sending app notification: " + message);
	}
}

public class TaskMainNotifecation_1 {
	public static void main(String[] args) {

		Notification notification = new EmailNotification();
		notification.send("Hello  Email!....");

		notification = new AppNotification();
		notification.send("Hello  App!...");
	}
}
