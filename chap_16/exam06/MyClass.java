package exam06;

public class MyClass {
	//인터페이스로 구현 객체를 사용하는 방법 4가지
	
	//1)인터페이스가 필드 타입으로 사용될 경우, 필드에 구현 객체를 대입할 수 있다.
	RemoteControl rc = new Television();

	MyClass() {}
	//2)인터페이스가 생성자의 매개변수 타입으로 사용될 경우, new연산자로 객체를 생성할 때 구현 객체를 생성자의 매개값으로 대입할 수 있다.
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//3)인터페이스가 로컬 변수 타입으로 사용될 경우, 변수에 구현 객체를 대입할 수 있다.
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(50);
	}
	
	//4)인터페이스가 메소드의 매개변수 타입으로 사용될 경우, 메소드 호출 시 구현 객체를 매개값으로 대입할 수 있다.
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(-50);
	}
}