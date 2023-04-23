package conditional;

import java.util.Scanner;

public class _09_Prac02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//변수선언
		int kor;
		int eng;
		int total;
		double avg;
		char grade;
				
		//입력
		System.out.print("국어점수 입력: ");
		kor = sc.nextInt();
		System.out.print("영어점수 입력: ");
		eng = sc.nextInt();
		
		//연산
		total = kor + eng;
		avg = (double) total / 2;
		
		if(avg>=90) grade = 'A';
		else if(avg>=80) grade = 'B';
		else if(avg>=70) grade = 'C';
		else if(avg>=60) grade = 'D';
		else grade = 'F';
		
		//출력
		System.out.println("총점 = " + total);
		System.out.println("평균 = " + avg);
		System.out.println("학점 = " + grade);
	}
}