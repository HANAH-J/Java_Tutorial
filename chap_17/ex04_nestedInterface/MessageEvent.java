package ex04_nestedInterface;

public class MessageEvent implements Button.OnclickEvent {//Button 클래스 내부의 인터페이스를 의미
	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");
	}
}