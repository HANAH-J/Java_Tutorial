package conditional;

import java.util.Scanner;

public class _06_Review02_self_t {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int mid;
		int fin;
		int report;
		int present;
		double avg;
		char grade;
		
		System.out.print("중간고사를 입력하시오: ");
		mid = scanner.nextInt();
		System.out.print("기말고사를 입력하시오: ");
		fin = scanner.nextInt();
		System.out.print("과제점수를 입력하시오: ");
		report = scanner.nextInt();
		System.out.print("출석점수를 입력하시오: ");
		present = scanner.nextInt();
		
		avg = (mid + fin + report + present) / 4;
		System.out.println(" 성적 = " + avg);
		
		if(avg>=90) {
			System.out.println(" 학점 = A");
			System.out.println(" 평가 = excellent");
		}else if(avg>=80) {
			System.out.println(" 학점 = B");
			System.out.println(" 평가 = excellent");
		}else if(avg>=70) {
			System.out.println(" 학점 = C");
			System.out.println(" 평가 = good");
		}else if(avg>=60) {
			System.out.println(" 학점 = D");
			System.out.println(" 평가 = good");
		}else {
			System.out.println(" 학점 = F");
			System.out.println(" 평가 = poor");
		}
	}
}