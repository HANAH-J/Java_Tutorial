package conditional;

import java.util.Scanner;

public class _12_Exam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력: ");
		int jumsu = sc.nextInt();
		
		if(jumsu >=90) System.out.println("A학점입니다.");
		else if(jumsu >=80) System.out.println("B학점입니다.");
		else if(jumsu >=70) System.out.println("C학점입니다.");
		else if(jumsu >=60) System.out.println("D학점입니다.");
		else System.out.println("F학점입니다.");
	}
}