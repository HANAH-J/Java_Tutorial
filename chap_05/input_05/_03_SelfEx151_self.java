package input;

import java.util.Scanner;

public class _03_SelfEx151_self {
	public static void main(String[] args) {
//		op1();
//		op2();
		op3();
	}

	private static void op3() {
		System.out.println("=====변수와 입출력 확인문제3=====");
//		3. Scanner를 이용해서 이름, 주민번호 앞 6자리, 전화번호를 키보드에서 입력받고 출력하는 코드를 작성해보세요.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		String str1 = scanner.nextLine();
		
		System.out.print("2. 주민번호 앞 6자리: ");
		String str2 = scanner.nextLine();
		
		System.out.print("3. 전화번호: ");
		String str3 = scanner.nextLine();
		
		System.out.println();
		
		System.out.println("[입력한 내용]");
		System.out.println("1. 이름: " + str1);
		System.out.println("2. 주민번호 앞 6자리: " + str2);
		System.out.println("3. 전화번호: " + str3);
	}

	private static void op2() {
		System.out.println("=====변수와 입출력 확인문제2=====");
//		2. Scanner를 이용해서 키보드로 입력한 두 수를 덧셈하여 결과를 출력하고자 합니다. 괄호에 들어갈 코드를 작성해보세요.
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수: ");
		String strNum1 = scanner.nextLine();
		
		System.out.print("두번째 수: ");
		String strNum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과: " + result);
	}

	private static void op1() {
		System.out.println("=====변수와 입출력 확인문제1=====");
//		1. 다음과 같이 출력되도록 괄호에 들어갈 코드를 작성해보세요.
		String name = "감자바";
		int age = 25;
		String tel1 = "010", tel2 = "123", tel3 = "4567";
		System.out.println("이름: " + name);
		System.out.print("나이: " + age + "\n");
		System.out.printf("전화: %1$s-%2$s-%3$s", tel1, tel2, tel3);
	}
}