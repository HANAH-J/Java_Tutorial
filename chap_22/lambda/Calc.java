package chap16;

public class Calc {
	public Calc(int x) { // int형 데이터를 받아서 Calc로 만들어진 인스턴스를 반환
		System.out.println(x + "를 입력 받아서 인스턴스를 만들었습니다.");
	}
	public int instanceMethod(int a, int b) {
		return a + b;
	}
	
	public static int staticMethod(int a, int b) {
		return a * b;
	}
}