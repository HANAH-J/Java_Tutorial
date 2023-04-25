package array;

import java.util.Scanner;

public class _15_Review01_self {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//final 활용해보기
		final int NUM = 2;
		String[] name = new String[NUM] ;
		int[] kor = new int[NUM];
		int[] eng = new int[NUM];
		int[] math = new int[NUM];
		
		int[] total = new int[NUM];
		double[] avg = new double[NUM];
		char[] grade = new char[NUM];
		
		for(int i=0; i<name.length; i++) {
			System.out.print("이름: ");
			name[i] = sc.next();
			System.out.print("국어: ");
			kor[i] = sc.nextInt();
			System.out.print("영어: ");
			eng[i] = sc.nextInt();
			System.out.print("수학: ");
			math[i] = sc.nextInt();
			System.out.println();
		}
		
		for(int i=0; i<name.length; i++) {
			total[i] = kor[i] + eng[i] + math[i];
			avg[i] = total[i]/3;
			if(avg[i] >= 90) {
				grade[i] = 'A';
			}else if(avg[i] >= 80) {
				grade[i] = 'B';
			}else if(avg[i] >= 70) {
				grade[i] = 'C';
			}else if(avg[i] >= 60) {
				grade[i] = 'D';
			}else {
				grade[i] = 'F';
			}	
		}
		System.out.println("이름\t" + "국어\t" + "영어\t" + "수학\t" + "총점\t" + "평균\t" + "학점");
		System.out.println("--------------------------------------------------");
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i] + "\t" +  kor[i] + "\t" + eng[i] + "\t" + math[i] + "\t" + total[i] + "\t" + avg[i] + "\t" + grade[i]);
		}
	}
}