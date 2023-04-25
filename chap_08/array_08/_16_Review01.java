package array;

import java.util.Scanner;

public class _16_Review01 {
	public static void main(String[] args) {
		//배열을 활용하여 학생 3명의 국, 영, 수 총점, 평균, 학점 내기 과제
		Scanner sc = new Scanner(System.in);
		
		//선언
		final int NUM = 3; //학생수
		String[] name = new String[NUM]; //학생명
		String[] subject = {"국어", "영어", "수학"}; //과목
		int [][] jumsu = new int[NUM][3]; //학생들의 과목별 점수
		int[] tot = new int[NUM]; // 학생들의 총점
		double[] avg = new double[NUM]; //학생들의 평균
		char[] grade = new char[NUM]; //학생들의 등급
		
		//입력+연산
		for(int i=0; i<=name.length; i++) {
			System.out.print("이름: ");
			name[i] = sc.next();
			
			//학생별 과목점수 입력, 합계, 평균 구하기
			for(int j=0; j<subject.length; j++) {
				System.out.printf("%s: ", subject[j]);
				jumsu[i][j] = sc.nextInt();
				tot[i] += jumsu[i][j];
			}
			avg[i] = tot[i]/subject.length;
			
			//연산 결과로 등급 매기기
			switch((int)avg[i]/10) {
			case 10:
			case 9: grade[i] = 'A'; break;
			case 8: grade[i] = 'B'; break;
			case 7: grade[i] = 'C'; break;
			case 6: grade[i] = 'D'; break;
			default: grade[i] = 'F'; break;
			}
		}
				
		//출력
		System.out.println("이름	국어	영어	수학	총점	평균	학점");
		System.out.println("--------------------------------------------------");
		for(int i=0; i<name.length; i++) {
			System.out.printf("%s	%3d	%3d	%3d	%3d	%.2f %c\n", name[i], jumsu[i][0], jumsu[i][1], jumsu[i][2], tot[i], avg[i], grade[i]);
		}
	}
}