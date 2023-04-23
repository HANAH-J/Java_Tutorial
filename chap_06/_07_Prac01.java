package conditional;

import java.util.Scanner;

public class _07_Prac01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor;
		int eng;
		int math;
		int score;
		
		System.out.print("국어 점수: ");
		kor = sc.nextInt();
		
		System.out.print("영어 점수: ");
		eng = sc.nextInt();
		
		System.out.print("수학 점수: ");
		math = sc.nextInt();
		
		score = (kor + eng + math)/3;
		
		if( (kor>40)&&(eng>40)&&(math>40)&&(score>=60)) {
			System.out.println("합격");
		}else	{
			System.out.println("불합격");
		}
	}
}