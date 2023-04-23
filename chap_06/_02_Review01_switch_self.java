package conditional;

import java.util.Scanner;

public class _02_Review01_switch_self {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double first;
		double second;
		String str;
		
		System.out.print("첫 번째 수: ");
		first = scanner.nextDouble();
		
		System.out.print("두 번째 수: ");
		second = scanner.nextDouble();
		
		System.out.print("연산자: ");
		str = scanner.next();
		
		switch(str) {
		case "+" : System.out.println(first + " + " + second + " = " + (first+second)); break;
		case "-" : System.out.println(first + " - " + second + " = " + (first-second)); break;
		case "/" : System.out.println(first + " / " + second + " = " + (first/second)); break;
		case "*" : System.out.println(first + " * " + second + " = " + (first*second)); break;
		case "%" : System.out.println(first + " % " + second + " = " + (first%second)); break;
		default: System.out.println("연산자를 정확히 입력해주세요.");
		}
	}
}