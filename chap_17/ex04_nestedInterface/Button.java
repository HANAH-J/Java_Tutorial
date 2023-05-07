package ex04_nestedInterface;

public class Button {
	//클래스 안에 인터페이스를 생성 -> 중첩 인터페이스는 클래스의 멤버로 선언이 된 인터페이스를 말한다.
	interface OnclickEvent{
		void onClick(); //추상 메소드
	}
	
	//인터페이스 타입 객체 선언
	OnclickEvent event;
	
	void setOnclickEvent(OnclickEvent event) {
		this.event = event;
	}
	
	void touch() {
		event.onClick(); //인터페이스 타입 객체의 추상 메소드 호출
	}
	
}