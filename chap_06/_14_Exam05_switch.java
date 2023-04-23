package conditional;

import java.util.Scanner;

public class _14_Exam05_switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//선언
		int midExam;
		int finalExam;
		int report;
		int present;
		double avg;
		char grade;
		String result;
		
		//입력
		System.out.print("중간고사: "); //30%
		midExam = sc.nextInt();
		System.out.print("기말고사: "); //30%
		finalExam = sc.nextInt();
		System.out.print("레포트점수: "); //20%
		report = sc.nextInt();
		System.out.print("출석점수: "); //20%
		present = sc.nextInt();
		
		//연산
		avg = ((midExam + finalExam) / 2 *0.6) + (report *0.2) + (present *0.2);
//		System.out.println(avg);
		
		//학점
		switch((int) avg/10) {
		case 10:
		case 9: grade='A'; break;
		case 8: grade='B'; break;
		case 7: grade='C'; break;
		case 6: grade='D'; break;
		default: grade='F';
		}
		
		//평가점수
		switch(grade) {
		case 'A': 
		case 'B': result = "excellent"; break;
		case 'C': 
		case 'D': result = "good"; break;
		default: result = "poor"; break;
		}
		
		System.out.printf("성적 = %.2f\n", avg);
		System.out.println("학점 = " + grade);
		System.out.println("평가 = " + result);
	}
}