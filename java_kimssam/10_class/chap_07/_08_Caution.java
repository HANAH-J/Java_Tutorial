package chap_07;

class Block3{
	String name;
	static String staticName;
	
	Block3(){
		System.out.println("나는 생성자 함수이다.");
	}
	
	void method1() {
		System.out.println("함수1이 동작한다.");
	}
	
	static void method2() {
		System.out.println("함수2가 동작한다.");
	}
	
	static {
		System.out.println("나는 static 블럭이다."); // static블럭은 생성자함수보다 먼저 호출이 되면서 객체를 여러번 만들어도 딱 한번만 호출된다.
	}

	// static메소드를 사용할 때 주의할 점
	static void method3() {
		// this.name = "김동률"; // static메소드 안에서는 인스턴스 변수 사용 불가, this키워드도 사용 불가
		// this.method1(); // static메소드 안에서는 인스턴스 메소드 사용 불가, this키워드도 사용 불가
		staticName ="김동률";
		method2();
	}
}

public class _08_Caution {
	public static void main(String[] args) {
		Block3 b1 = new Block3();
		Block3 b2 = new Block3();
		System.out.println("====================");
		b1.method1();
		b1.method2();
		b1.method3();
		System.out.println(b1.staticName);
	}
}