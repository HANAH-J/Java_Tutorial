package input;

import java.util.Scanner;

public class _04_SelfEx151_t {
	public static void main(String[] args) {
//		ex01();
//		ex02();
		ex03();
	}

	private static void ex03() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. 이름: ");
		String name = sc.next();
		
		System.out.print("2. 주민번호 앞 6자리: ");
		String id = sc.next();
		
		System.out.print("3. 전화번호: ");
		String tel = sc.next();
		
		System.out.printf("%s\n%s\n%s", name, id, tel);
	}

	private static void ex02() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수: ");
		String strNum1 = sc.next();
		
		System.out.print("두번째 수: ");
		String strNum2 = sc.next();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과: " + result);
	}

	private static void ex01() {
		String name = "감자바";
		int age = 25;
		String tel1 = "010", tel2 = "123", tel3 = "4567";
		System.out.println("이름: " + name);
		System.out.print("나이: " + age);
		System.out.printf("\n전화: %s-%s-%s", tel1, tel2, tel3);
	}
}