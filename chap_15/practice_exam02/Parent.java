package exam02;

public abstract class Parent { //추상 클래스
	void show() {
		System.out.println("나는 부모 메소드");
	}
	abstract void call(); //추상 메소드는 구현부분이 없다.
	//메소드의 선언만 통일하고 실행 내용은 실체 클래스마다 달라야 하는 경우 추상 메소드를 선언한다. 추상 메소드가 하나라도 있다면 그 클래스는 반드시 추상 클래스가 되어야 한다. 하지만 추상 메소드가 없어도 추상 클래스로 선언할 수 있다.
}