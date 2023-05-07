package ex04_nestedInterface;

public class CallEvent implements Button.OnclickEvent {//Button 클래스 내부의 인터페이스를 의미
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
}