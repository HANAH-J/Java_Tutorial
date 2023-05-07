package ex05_anonymous.implement;

/*
 익명 구현 객체는 인터페이스를 구현
 new 인터페이스(){
 	//필드
 	//메소드
  방식으로 생성되며 이렇게 생성된 객체는 인터페이스 타입의 필드, 로컬변수, 매개변수의 값으로 대입할 수 있다.
 */

public class Home {
	//1)필드에 익명 구현 객체 대입
	private RemoteControl rc = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
	};
	
	//1)메소드에서 필드로 이용
	public void use1() {
		rc.turnOn();
	}
	
	//2)메소드의 로컬 변수로 이용
	public void use2() {
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다.");
			}
		};
		rc.turnOn();
	}
	
	//3)메소드의 매개변수로 이용
	public void use3(RemoteControl rc) {
		rc.turnOn();
	}
}