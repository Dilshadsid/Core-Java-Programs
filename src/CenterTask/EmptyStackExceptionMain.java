package CenterTask;

/*Ek text editor banana hai.
Stack<String> undoStack aur Stack<String> redoStack use karo.
Task: Implement methods typeText(), undo(), redo().
Edge Case: Agar empty stack pe undo/redo kare → EmptyStackException*/
import java.util.EmptyStackException;
import java.util.Stack;

public class EmptyStackExceptionMain {
	private String text = "";
	private Stack<String> undoStack = new Stack<>();
	private Stack<String> redoStack = new Stack<>();

	void textType(String newTest) {
		undoStack.push(text);
		text = text + newTest;
		redoStack.clear();
	}
	public void undo() {
		if (undoStack.isEmpty())
			throw new EmptyStackException();
		redoStack.push(text);
		text = undoStack.pop();
	}
	public void redo() {
		if (redoStack.isEmpty())
			throw new EmptyStackException();
		undoStack.push(text);
		text = redoStack.pop();
	}
	public String getText() {
		return text;
	}
	public static void main(String[] args) {
		EmptyStackExceptionMain stack = new EmptyStackExceptionMain();
		stack.textType("java (1....)");
		stack.textType("Programming(2....)");

		System.out.println(stack.getText());

		stack.undo();
		System.out.println(stack.getText());

		stack.redo();
		System.out.println(stack.getText());
	}
}
