package input;

import java.util.Scanner;

public class _05_Prac01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		double basepay;
		double salary;
		double tax;
		
		System.out.print("이름 입력: ");
		name = sc.next();
		
		System.out.print("기본급: ");
		basepay = sc.nextDouble();
		
		tax = basepay *0.033;
		salary = basepay - tax;
		
		System.out.println("기본급: " + basepay);
		System.out.println("월급: " + salary);
		System.out.println("세금: " + tax);
}
}