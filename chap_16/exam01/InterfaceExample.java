package exam01;

import java.util.Scanner;

public class InterfaceExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("0과 100 사이의 숫자를 입력해주세요.: ");
		int num = sc.nextInt();
		
		if(num < Limit.MIN || num > Limit.MAX) {
			System.out.println("유효한 범위의 숫자가 아닙니다.");
		}else if(num <= Limit.MAX && num >= Limit.MIN) {
			System.out.println("OK! 유효한 숫자입니다.");
		}
		sc.close();
	}
}