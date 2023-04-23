package conditional;

import java.util.Scanner;

public class _01_Review01_if_self {
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
		
		if(str.equals("+")) {
			System.out.printf("%.1f + %.1f = %.1f", first, second, first+second);
		}else if(str.equals("-")) {
			System.out.printf("%.1f + %.1f = %.1f", first, second, first-second);
		}else if(str.equals("/")) {
			System.out.printf("%.1f + %.1f = %.1f", first, second, first/second);
		}else if(str.equals("*")) {
			System.out.printf("%.1f + %.1f = %.1f", first, second, first*second);
		}else {	System.out.printf("%.1f + %.1f = %.1f", first, second, first%second);
		
		}
	}
}