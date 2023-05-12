package chap16;

import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;

public class Main03 {
	public static void main(String[] args) {
		// 메서드 참조 : 이미 다른 곳에 만들어진 메서드 그대로 이용하는 방법
		IntBinaryOperator op;
		
		// 1) 인스턴스 메서드를 그대로 사용하는 람다 -> 함수적 인터페이스
		op  = (x, y) -> {return x + y;};
		System.out.println("일반적인 람다 : " + op.applyAsInt(5, 8));
		
		Calc c1 = new Calc(3);
		op = (x, y) -> {return c1.instanceMethod(x, y);};
		System.out.println("다른 메서드를 그대로 사용하는 상황 : " + op.applyAsInt(5, 8));
		
		op = c1::instanceMethod; // 인스턴스 메서드 참조 -> 인스턴스 변수::메서드;
		System.out.println("메서드 참조 : " + op.applyAsInt(5, 8));
		
		// 2) 정적 메서드를 그대로 사용하는 람다
		op = (x, y) -> {return Calc.staticMethod(x, y);};
		System.out.println("다른 정적 메서드를 그대로 사용하는 상황 : " + op.applyAsInt(5, 8));
		
		op = Calc::staticMethod; // 정적 메서드 참조 -> 클래스 이름::정적 메서드;
		System.out.println("정적 메서드 참조 : " + op.applyAsInt(5, 8));
		
		// 3) 생성자 참조 : 생성자 메서드를 그대로 사용하는 람다
		Calc c3 = new Calc(3);
		
		IntFunction<Calc> ifc;
		
		ifc = (z) -> {return new Calc(z);};
		Calc c4 = ifc.apply(4);
		
		ifc = Calc::new; // 생성자 참조 -> 클래스 이름::new;
		Calc c5 = ifc.apply(5);
	}
}