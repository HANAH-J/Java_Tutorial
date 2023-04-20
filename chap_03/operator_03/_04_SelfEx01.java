package operator_03;

import java.util.Scanner;

public class _04_SelfEx01 {
	public static void main(String[] args) {
//		ex01();
//		ex02();
//		ex03();
//		ex04();
//		ex05();
//		ex06();
//		ex07();
//		ex08();
//		ex09();
//		ex10();
//		ex11();
//		ex12();
//		ex13();
		ex14();
	}

	private static void ex14() {
		int score = 85;
		String result = (!(score>90)) ? "가" : "나";
		System.out.println(result);
	}

	private static void ex13() {
		int value = 0;
		
		value += 10;
		System.out.println(value);
		value -= 10;
		System.out.println(value);
		value *= 10;
		System.out.println(value);
		value /= 10;
		System.out.println(value);
	}

	private static void ex12() {
		int x = 10;
		int y = 5;
		System.out.println( (x>7) && (y<=5) );
		System.out.println( (x%3 == 2) || (y%2 != 1) );
	}

	private static void ex11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String name = sc.nextLine();
		
		System.out.print("패스워드: ");
		String strPassword = sc.nextLine();
		int password = Integer.parseInt(strPassword);
		
		//문자열이 같은지 비교할 때에는 ==을 사용하는 것이 아니라 .equals(“문자열”) 메소드를 사용한다.
		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패: 패스워드가 틀림");
		}
		}else {
			System.out.println("로그인 실패: 아이디 존재하지 않음");
		}
	}

	private static void ex10() {
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
		System.out.println("원의 넓이: " + var4);
	}

	private static void ex09() {
		//ctrl+shift+o: 패키지 import
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 실수를 입력해주세요.");
		double d1 = Double.parseDouble(sc.next());
		System.out.println("두 번째 실수를 입력해주세요.");
		double d2 = Double.parseDouble(sc.next());
		
		if(d2 == 0.0) {
			System.out.println("결과: 무한대");
		}else {
			System.out.println("결과: " + d1 / d2);
		}
	}

	private static void ex08() {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop + lengthBottom) * height / 2;
		System.out.println(area);
	}

	private static void ex07() {
		int var1 = 10;
		int var2 = var1 / 100*100;
		if(var1 == 10) {
			System.out.println("10%입니다.");
		}else {
			System.out.println("10%가 아닙니다.");
		}
	}

	private static void ex06() {
		int value = 356;
		System.out.println(value / 100 * 100);
	}

	private static void ex05() {
		int var1 = 5;
		int var2 = 2;
		double var3 = (double)var1 / (double)var2;
		int var4 = (int) (var3 * var2);
		System.out.println(var4);
	}

	private static void ex04() {
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = (pencils % students);
		System.out.println(pencilsLeft);
	}

	private static void ex03() {
		boolean stop = true;
		while(!stop) {
			System.out.println("반복실행");
		}
	}

	private static void ex02() {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		System.out.println(y);
	}

	private static void ex01() {
		byte b = 5;
		//byte나 short같은 정수는 int형으로 변환되어 연산된다.
		int c = -b;
		int result = 10 / c;
		System.out.println(result);
	}
}