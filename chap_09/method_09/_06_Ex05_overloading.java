package method;

public class _06_Ex05_overloading {
	//메소드 오버로딩이란 하나의 클래스에서 같은 이름의 메소드를 사용하면서 매개변수의 타입이나 순서, 개수를 다르게 주는 것을 말한다. 매개변수의 타입, 순서, 개수는 같고 리턴타입만 다를 경우에는 오버로딩이 성립하지 않는다!
	public static int plus(int a, int b) {
		return a+b;
	}
//	public static double plus(int c, int d) {
//		return a+b;
//	}
	public static double plus(double a, double b) {
		return a-b;
	}
	public static double plus(double a, int b) {
		return a*b;
	}
	public static double plus(int a, double b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		System.out.println(plus(10,5));
		System.out.println(plus(5.5,7.7));
		System.out.println(plus(5.5,7));
		System.out.println(plus(5,7.7));
	}
}