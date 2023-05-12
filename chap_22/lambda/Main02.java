package chap16;

public class Main02 {
	public static void main(String[] args) {
		// 데이터로서 메서드를 사용
		
		// 메서드의 종류
		// 1) 매개값 X, 반환값 X	Ex02
		// 2) 매개값 X, 반환값 O	Ex03
		// 3) 매개값 O, 반환값 X	Ex04
		// 4) 매개값 O, 반환값 O	Ex06
		
		// 각각의 예제
		// 1)
		Ex02 f2;
		f2 = () -> {System.out.println("메서드 호출");};
		f2.method();
		
		// 2)
		Ex03 f3;
		f3 = () -> {return 10;};
		int result3 = f3.method();
		System.out.println("결과 : " + result3);
		
		// 3)
		Ex04 f4;
		f4 = (a) -> {System.out.println(a);};
		f4.method(10);
		
		// 4)
		Ex05 f5;
		f5 = (x, y) -> {return x + y;};
		int result5 = f5.method(10, 20);
		System.out.println("결과 : " + result5);
		
		// 메서드의 간소화
		Ex04 func04;
		func04 = a -> System.out.println(a);
		
		Ex05 func5;
		func5 = (x, y) -> x + y;
	}
}