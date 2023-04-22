package input;

import java.util.Scanner;

public class _06_Exam01 {
	public static void main(String[] args) {
		//클래스 선언
		Scanner sc = new Scanner(System.in);
		
		//1. 데이터를 저장할 변수 선언
		String name = "";
		int kor = 0;
		double math = 0;
		boolean b = false;
		char ch = 0;
		
		//2. 변수에 데이터를 저장하여 입력
		System.out.print("이름: ");
		name = sc.next();
		
		System.out.print("국어점수: ");
		kor = sc.nextInt();
		
		System.out.print("수학점수: ");
		math = sc.nextDouble();
		
		System.out.print("거짓 혹은 진실: ");
		b = sc.nextBoolean();
		
		System.out.print("문자 한개: ");
		ch = sc.next().charAt(0);
		
//		3. 연산과 출력
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("수학: " + math);
		System.out.println("진실 혹은 거짓: " + b);
		System.out.println("문자 하나: " + ch);
	}
}