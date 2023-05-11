package chap15;

public class Main01 {
	public static void main(String[] args) {
		A a1 = new A();
		
		a1.f1.method();
		
		// 인스턴스 멤버 클래스(B)의 인스턴스를 생성
		A.B b1 = a1.new B();
		b1.method();

		// 정적 멤버 클래스(C)의 인스턴스를 생성
		A.C c1 = new A.C();
		c1.method();
		
		// 로컬 클래스(D)의 인스턴스를 생성
		a1.method();

	}
}