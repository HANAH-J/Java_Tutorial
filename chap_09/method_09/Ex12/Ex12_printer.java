package method.Ex12;

public class Ex12_printer {
	//클래스는 속성(인스턴스 변수)만 갖는 클래스도 가능하고 메소드만 갖는 클래스도 가능하고 아니면 둘 다 가질 수도 있다.
	
	//메소드만 갖는 클래스
	//메소드 오버로딩
	static void print(int value) {
		System.out.println(value);
	}
	static void print(boolean value) {
		System.out.println(value);
	}
	static void print(double value) {
		System.out.println(value);
	}
	static void print(String value) {
		System.out.println(value);
	}
}