package ex03_local;

class A{//3)로컬 클래스는 생성자 또는 메소드 내부에서 선언된 클래스를 말한다.
	//생성자
	public A() {
		class B{}
		
		//로컬 객체 생성
		B b = new B();
	}
	
	//메소드
	public void method() {
		//로컬 클래스 선언
		class B{}
		
		//로컬 객체 생성
		B b = new B();
	}
}

public class AExample {
	public static void main(String[] args) {
		//A객체 생성 후
		A a = new A();
		//A의 메소드에서 호출에서 사용
		a.method();
	}
}