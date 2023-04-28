package classes;

class Block2 {
	String name;
	static String staticName;
	
	Block2() {
		System.out.println("나는 생성자 함수이다.");
	}
	
	void method1() {
		System.out.println("함수1이 동작한다.");
	}
	static void method2() {
		System.out.println("함수2가 동작한다.");
	}
	
	static {
		System.out.println("나는 static 블럭이다."); //static 블럭은 생성자 함수보다 먼저 호출이 되면서 객체를 여러 번 만들어도 딱 한번만 호출된다.
	}
}

public class Ex11_static {
	public static void main(String[] args) {
		Block2 b1 = new Block2();
		Block2 b2 = new Block2();
		System.out.println("===============");
	}
}