package method;

import java.util.Scanner;

public class _10_Ex08_Prac02 {
	//국어점수를 입력받는 메소드
	public static int input_kor() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 입력: ");
		int kor = sc.nextInt();
		return kor;
	}
		
	//영어점수를 입력받는 메소드
	public static int input_eng() {
		Scanner sc = new Scanner(System.in);
		System.out.print("영어점수 입력: ");
		int eng = sc.nextInt();
		return eng;
	}
	
	//총합을 구하는 연산 메소드
	public static int tot(int kor, int eng) {
		int tot = kor + eng;
		return tot;
	}
	
	//평균을 구하는 연산 메소드
	public static double avg(int tot) {
		double avg = tot/2;
		return avg;
	}
	
	//등급을 구하는 메소드
	public static char grade(double avg) {
		switch((int)avg/10) {
		case 10:
		case 9: return 'A';
		case 8: return 'B';
		case 7: return 'C';
		case 6: return 'D';
		default: return 'F';
		}
	}
	//출력하는 메소드
	public static void output(double avg) {
		System.out.println(grade(avg) + "학점입니다.");
	}
	
	//실행 메소드
	public static void main(String[] args) {
		int kor, eng, tot;
		double avg;
		
		kor = input_kor();
		eng = input_eng();
		tot = tot(kor, eng);
		avg = avg(tot);
		output(avg);
	}
}