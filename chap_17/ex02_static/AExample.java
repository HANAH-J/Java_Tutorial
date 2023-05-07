package ex02_static;

class A{//2)정적 멤버 클래스는 static 키워드와 함께 A클래스의 멤버로 선언한 B클래스를 말한다.
	static class B{}
	
	//인스턴스 필드 값으로 B객체 대입
	B field1 = new B();
	
	//정적 필드 값으로 B객체 대입
	static B field2 = new B();
	
	//생성자
	A() {
		B b = new B();
	}
	
	//인스턴스 메소드
	void method1() {
		B b = new B();
	}
	
	//정적 메소드
	static void method2() {
		B b = new B();
	}
}

public class AExample {
	public static void main(String[] args) {
		//A객체 생성없이 B객체 바로 생성 가능
		A.B b = new A.B();
	}
}