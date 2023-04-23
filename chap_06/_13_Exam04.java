package conditional;

import java.util.Scanner;

public class _13_Exam04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//선언
		int score;
		char grade;
		
		//입력
		System.out.print("점수 입력: ");
		score = sc.nextInt();
		
		//연산
		switch(score/10) {
			case 10: 
			case 9: grade = 'A'; break;
			case 8: grade = 'B'; break;
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;
			default: grade = 'F';
		}
		
		//출력
		System.out.println("당신이 입력한 " + score + "점은 " + grade + "등급입니다.");
	}
}