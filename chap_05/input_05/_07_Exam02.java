package input;

import java.util.Scanner;

public class _07_Exam02 {
	public static void main(String[] args) {
		//클래스 선언
		Scanner sc = new Scanner(System.in);
		
		//1. 데이터를 저장할 변수 선언
		String name = "";
		double kor = 0;
		double math = 0;
		double eng = 0;
		
		//2. 변수에 데이터를 저장하여 입력
		System.out.print("이름: ");
		name = sc.next();
		
		System.out.print("국어점수: ");
		kor = sc.nextDouble();
		
		System.out.print("수학점수: ");
		math = sc.nextDouble();
		
		System.out.print("영어점수: ");
		eng = sc.nextDouble();
		
		System.out.println("====================");
		
//		3. 연산과 출력
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("수학: " + math);
		System.out.println("영어: " + eng);
		double total = kor+math+eng;
		System.out.println("총점: " + total);
		System.out.println("평균: " + total/3);
		System.out.printf("평균: %7.2f", total/3 );
	}
}