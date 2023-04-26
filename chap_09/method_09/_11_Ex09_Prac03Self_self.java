package method;

import java.util.Scanner;

public class _11_Ex09_Prac03Self_self {
	public static int input_kor() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수: ");
		int kor = sc.nextInt();
		return kor;
	}
	public static int input_eng(){
		Scanner sc = new Scanner(System.in);
		System.out.print("영어 점수: ");
		int eng = sc.nextInt();
		return eng;
	}
	public static int input_math(){
		Scanner sc = new Scanner(System.in);
		System.out.print("수학 점수: ");
		int math = sc.nextInt();
		return math;
	}
	public static int tot(int kor, int eng, int math) {
		int tot = kor + eng + math;
		return tot;
	}
	public static double avg(int tot) {
		double avg = tot/3;
		return avg;
	}
	public static void pass(int kor, int eng, int math, double avg) {
		if( (kor>40)&&(eng>40)&&(math>40)&&(avg>=60)) {
			System.out.print("합격");
		}else	{
			System.out.print("불합격");
		}
	}
	public static void main(String[] args) {
		int kor, eng, math, tot;
		double avg;

		kor = input_kor();
		eng = input_eng();
		math = input_math();
		tot = tot(kor, eng, math);
		avg = avg(tot);
		pass(kor, eng, math, avg);
	}
}