package conditional;

import java.util.Scanner;

public class _08_Prac02_self {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 입력: ");
		int kor = sc.nextInt();
		
		System.out.print("영어점수 입력: ");
		int eng = sc.nextInt();
		
		double avr = (double) (kor + eng) / 2;
		
		System.out.println("총점 = " + (int) (kor + eng));
		System.out.println("평균 = " + avr);
		
		if(avr>=90) {
			System.out.println("학점 = A");
		}else if(avr>=80) {
			System.out.println("학점 = B");
		}
		else if(avr>=70) {
			System.out.println("학점 = C");
		}
		else if(avr>=60) {
			System.out.println("학점 = D");
		}else {
			System.out.println("학점 = F");
		}
	}
}