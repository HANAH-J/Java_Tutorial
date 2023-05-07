package ex01_instance;

//중첩 클래스 nested class(내부 클래스 inner class): 클래스 내부에 선언한 클래스로 멤버 클래스와 로컬 클래스가 있다.
//멤버 클래스는 클래스의 멤버로서 선언되는 중첩 클래스로 1)인스턴스 멤버 클래스와 2)정적 멤버 클래스로 나뉘고 3)로컬 클래스는 메소드 내부에서 선언되는 중첩 클래스이다.
class A2 {//1)인스턴스 멤버 클래스
	class B{
		
	}
	
	//인스턴스 필드 값으로 B객체 대입
	B field = new B();
	
	//생성자
	A2() {
		B b = new B();
	}
	
	//인스턴스 메소드
	void mothod() {
		B b = new B();
	}
}

public class A{
	public static void main(String[] args) {
		//A객체 생성 후
		A2 a = new A2();
		//B객체 생성
		A2.B b = a.new B();
	}
}