public class MyMessage {
	String message;
public void print() {
		System.out.println("no message");
	}
	public MyMessage(String message) {
		this.message = message;
	}
	public void print() {
		System.out.println(message);
	}
public setMyMessage(String message) {
		this.message = message;
	}
}