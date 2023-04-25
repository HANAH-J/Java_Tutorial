package array;

import java.util.Scanner;

public class _01_Prac01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//선언
		int score[] = new int[5];
		int sum = 0;
		
		//입력
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1) +"번 학생의 점수를 입력: ");
			score[i] = sc.nextInt();
		}
		
		//연산
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		System.out.println("총점: " + sum + ", 평균" + (double) sum/score.length);
	}
}