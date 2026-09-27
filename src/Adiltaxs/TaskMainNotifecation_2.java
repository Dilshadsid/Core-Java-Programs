package Adiltaxs;

interface NotificationStrategy {
	void send(String message);
}

class EmailNootification implements NotificationStrategy {
	public void send(String message) {
		System.out.println("Sending email: " + message);
	}
}

class AppNootification implements NotificationStrategy {
	@Override
	public void send(String message) {
		System.out.println("Sending app notification: " + message);
	}
}

class NotificationService {
	private NotificationStrategy strategy;

	public NotificationService(NotificationStrategy strategy) {
		this.strategy = strategy;
	}

	public void sendMassage(String message) {
		strategy.send(message);
	}
}

public class TaskMainNotifecation_2 {
	public static void main(String[] args) {
		NotificationService emailService = new NotificationService(new EmailNootification());
		emailService.sendMassage("Hello Composition ..  Email!");

		NotificationService appService = new NotificationService(new AppNootification());
		appService.sendMassage("Hello Composition .. App!");
	}
}
