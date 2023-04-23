package conditional;

import java.util.Scanner;

public class _03_Review01_t {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//선언
		double num1, num2 = 0, result = 0;
		char operator = 0;
		
		//입력
		System.out.print("첫 번째 수: ");
		num1 = sc.nextDouble();
		System.out.print("두 번째 수: ");
		num2 = sc.nextDouble();
		System.out.print("연산자: ");
		operator = sc.next().charAt(0);
		
		//연산
		switch(operator) {
		case '+': result = num1 + num2; break;
		case '-': result = num1 - num2; break;
		case '*': result = num1 * num2; break;
		case '/': result = num1 / num2; break;
		case '%': result = num1 % num2; break;
		default: System.out.println("연산자를 정확히 입력해주세요.");
		}
		
		//출력
//		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		System.out.printf("%.1f %c %.1f = %.1f", num1, operator, num2, result);
	}
}