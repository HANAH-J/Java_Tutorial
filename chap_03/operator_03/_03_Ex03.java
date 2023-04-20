package operator_03;

import java.util.Scanner;

public class _03_Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수 입력:");
		double num1 = Double.parseDouble(sc.nextLine());
//		System.out.println(num1+num1);
		System.out.println("두번째 수 입력:");
		double num2 = Double.parseDouble(sc.nextLine());
		
		System.out.println(num1/num2);
	}
}