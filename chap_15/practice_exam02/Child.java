package exam02;

public class Child extends Parent {
	void print() {
		System.out.println("나는 자식 메소드");
	}
	@Override
	void call() {
		System.out.println("나는 부모 추상 메소드를 오버라이드한 자식 메소드");
	}
}