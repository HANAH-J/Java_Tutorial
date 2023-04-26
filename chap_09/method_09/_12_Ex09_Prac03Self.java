package method;

import java.util.Scanner;

public class _12_Ex09_Prac03Self {
	//각 과목의 점수가 40점 이상이거나 평균이 60점 이상인 경우에 합격인 프로그램을 각각의 기능별로 구분하여 메소드를 만들어 메인 메소드에서 실행해 보세요.
	
	//점수를 입력받는 메소드
	public static int input(String subject) {
		Scanner sc = new Scanner(System.in);
		System.out.print(subject + "점수: ");
		int jumsu = sc.nextInt();
		
		return jumsu;
	}
	
	//평균을 구하는 메소드
	public static double calc_avg(int kor, int eng, int math) {
		double avg;
		avg = (kor + eng + math) / 3;
		return avg;
	}
	
	//연산과 출력구문 메소드
	public static void output(int kor, int eng, int math, double avg) {
		if((kor >= 40) && (eng >= 40) && (math >= 40) && (avg >= 60)) System.out.print("합격");
		else System.out.print("불합격");
	}
	
	//실행할 메소드
	public static void main(String[] args) {
		int kor, eng, math;
		double avg;
		
		//입력
		kor = input("국어");
		eng = input("영어");
		math = input("수학");
		
		//평균 계산
		avg = calc_avg(kor, eng, math);
		
		//결과 출력
		output(kor, eng, math, avg);
	}
}