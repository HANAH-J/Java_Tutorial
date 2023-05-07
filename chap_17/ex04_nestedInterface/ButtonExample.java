package ex04_nestedInterface;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnclickEvent(new CallEvent());
		btn.touch();
		
		btn.setOnclickEvent(new MessageEvent());
		btn.touch();
	}
}