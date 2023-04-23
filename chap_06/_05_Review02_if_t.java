package conditional;

import java.util.Scanner;

public class _05_Review02_if_t {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//선언
		int midExam; //중간고사
		int finalExam; //기말고사
		int report; //과제점수
		int present; //출석점수
		double avg; //성적
		char grade; //학점
		String result; //평가
		
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
		if(avg >= 90) grade = 'A';
		else if(avg >= 80) grade = 'B';
		else if(avg >= 70) grade = 'C';
		else if(avg >= 60) grade = 'D';
		else grade = 'F';
		
		if(grade == 'A' || grade == 'B') result = "excellent";
		else if(grade == 'C' || grade == 'D') result = "good";
		else result = "poor";
		
		System.out.printf("성적평균: %.2f\n", avg);
		System.out.println("학점: " + grade);
		System.out.println("평가점수 " + result);
	}
}